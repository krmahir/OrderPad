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
        //public IActionResult PrintCommands(string userDefaultPrinter, string printerName) {

        //    ClientPrintJob cpj = new ClientPrintJob();
        //    return View();
        //}

        public void printFoodBill() {
            // … prior plumbing code removed for brevity
            // this code assumed you've already created a receipt print job (printJob)
            // and also that you've already checked the PosPrinter Capabilities to
            // verify that the printer supports Bold and DoubleHighDoubleWide print modes

            const string ESC = "\u001B";
            const string GS = "\u001D";
            const string InitializePrinter = ESC + "@";
            const string BoldOn = ESC + "E" + "\u0001";
            const string BoldOff = ESC + "E" + "\0";
            const string DoubleOn = GS + "!" + "\u0011";  // 2x sized text (double-high + double-wide)
            const string DoubleOff = GS + "!" + "\0";

            //printJob.Print(InitializePrinter);
            //printJob.PrintLine("Here is some normal text.");
            //printJob.PrintLine(BoldOn + "Here is some bold text." + BoldOff);
            //printJob.PrintLine(DoubleOn + "Here is some large text." + DoubleOff);

            //printJob.ExecuteAsync();
        }
    }
}
