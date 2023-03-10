using Microsoft.EntityFrameworkCore;
using OrderPad.Models;

namespace OrderPad.Data
{
    public class ApplicationDbContext :DbContext
    {
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options) : base(options)
        {

        }
        public DbSet<LoginRegistration> LoginRegistrations { get; set; }

        public DbSet<UserDetails> UserDetails { get; set; }
        public DbSet<Item> Item { get; set; }
    }
}
