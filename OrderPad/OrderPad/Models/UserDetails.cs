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
    public class UserDetails
    {

        [Key]
        [Required]
        public string? UserName { get; set; }


        public int RestaurentId { get; set; }

        public string? BusinessName { get; set; }

        public string? PhoneNumber { get; set; }

        public Types AccessType { get; set; }
    }

    public enum Types { 
        All,
        onlyOrder,
        onlyDelivery,
        none
    }
}
