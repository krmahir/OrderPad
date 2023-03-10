namespace OrderPad.Models
{
    public class Item
    {
        public int ID { get; set; }

        public int? RestaurentID { get; set; }   
        public string? Name { get; set; }

        public string? Description { get; set; }
        
        public string? Catagory { get; set; }

        public float? Price { get; set; }
    }
}
