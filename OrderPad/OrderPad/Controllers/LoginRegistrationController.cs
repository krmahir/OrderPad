using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using OrderPad.Data;
using OrderPad.Models;

namespace OrderPad.Controllers
{
    public class LoginRegistrationController : Controller
    {
        private readonly ApplicationDbContext _db;
        private LoginRegistration user;
        public LoginRegistrationController(ApplicationDbContext db)
        {
            _db = db;
        }
        public IActionResult Registration()
        {
            return View();
        }
        public IActionResult UserLIst()
        {
            IEnumerable<LoginRegistration> objloginRegistrations = _db.LoginRegistrations;
            return View(objloginRegistrations);
        }

        //POST
        [HttpPost]
        [ValidateAntiForgeryToken]
        public IActionResult Registration(LoginRegistration obj)
        {
            if (ModelState.IsValid)
            {
                _db.LoginRegistrations.Add(obj);
                _db.SaveChanges();
                return RedirectToAction("UserList");
            }
            return View(obj);
        }
        public IActionResult Login()
        {
            return View();
        }
        [HttpPost]
        public IActionResult Login(LoginRegistration obj)
        {        
            return RedirectToAction("restaurent", "User", _db.UserDetails.Where(x => x.UserName == obj.UserName).FirstOrDefault());
        }
        public IActionResult HomePage(LoginRegistration obj)
        {
            obj = user;
            return View(obj);
        }
        public JsonResult IsUserExists(string UserName)
        {
            //check if any of the UserName matches the UserName specified in the Parameter using the ANY extension method.  
            return Json(!_db.LoginRegistrations.Any(x => x.UserName == UserName) );
        }

        //public async Task<IActionResult> Details(int? id)
        //{
        //    if (id == null)
        //    {
        //        return NotFound();
        //    }

        //    var movie = await _context.Movie
        //        .FirstOrDefaultAsync(m => m.Id == id);
        //    if (movie == null)
        //    {
        //        return NotFound();
        //    }

        //    return View(movie);
        //}
    }
}
 