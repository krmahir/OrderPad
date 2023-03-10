using System.ComponentModel.DataAnnotations;
using System.Security.Cryptography.X509Certificates;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Web;
using Microsoft.Extensions.Primitives;
using Microsoft.AspNetCore.Mvc;

namespace OrderPad.Models
{
    public class LoginRegistration
    {
        [Key]
        [Required]
        public string Email { get; set; }
        [Required]
        public string Name { get; set; }
        [Required]
        [Remote("IsUserExists", "LogonRegistration", ErrorMessage = "User Name already in use")]
        public string UserName { get; set; }
        [Required]
        public string Password { get; set; }
    }
    public class Login
    {
        [Required]
        public string UserName { get; set; }
        [Required]
        public string Password { get; set; }
    }
    public class Profile
    {
        [Required]
        public string Email { get; set; }
        [Required]
        public string Name { get; set; }
        [Required]
        public string UserName { get; set; }
        [Required]
        public string Password { get; set; }
    }
    /**
    public class SearchProfile
    {

        public List<Profile> Search(List<string> Information){

            StringBuilder Buildsql = new StringBuilder();
            Buildsql.AppendFormat("select * from dbo.LoginRegistrations where {0} and {1};",Information.ElementAt(0), Information.ElementAt(1));
            
            /**            
            foreach (string value in Information) {
                Buildsql.AppendFormat();
            }
            return new List<Profile> mahir;
            
        }
    }
**/
}
