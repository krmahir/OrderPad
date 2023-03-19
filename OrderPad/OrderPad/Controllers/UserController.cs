using Microsoft.AspNetCore.Mvc;
using OrderPad.Data;
using OrderPad.Models;

namespace OrderPad.Controllers
{
    public class UserController : Controller
    {
        private readonly ApplicationDbContext _db;

        private Dictionary<string, List<Item>> itemGroup = new Dictionary<string, List<Item>>(); 

        public UserController(ApplicationDbContext db)
        {
            _db = db;
        }
        public IActionResult restaurent(UserDetails user)
        {
            ViewData["User"] = user;
            List<Item> items = _db.Item.Where(x=> x.RestaurentID == user.RestaurentId).ToList();
            var itemDictionary = new Dictionary<int, Item>();
            foreach (var item in items) {
                itemDictionary.Add(item.ID, item);
            }
            var itemGroupsinitial = items.GroupBy(x => x.Catagory);
            foreach (var lists in itemGroupsinitial) {
                var temp = new List<Item>();
                foreach (var item in lists) {
                    temp.Add(item);
                }
                itemGroup.Add(lists.Key.ToString(), temp);
            }
            ViewBag.itemGroup = this.itemGroup;
            ViewBag.item = itemDictionary;
            
            return View();
        }
    }
}
