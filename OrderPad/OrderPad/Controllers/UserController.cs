using Microsoft.AspNetCore.Mvc;
using OrderPad.Data;
using OrderPad.Models;

namespace OrderPad.Controllers
{
    public class UserController : Controller
    {
        private readonly ApplicationDbContext _db;

        public UserController(ApplicationDbContext db)
        {
            _db = db;
        }
        public IActionResult restaurent(UserDetails user)
        {
            ViewData["User"] = user;
            List<Item> items = _db.Item.Where(x=> x.RestaurentID == user.RestaurentId).ToList();
            
            return View();
        }
    }
}
