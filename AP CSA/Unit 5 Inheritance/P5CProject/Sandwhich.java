public class Sandwhich implements MenuItem
{
     private String name;
     private double price;
     
     public Sandwhich( String initName, double initPrice )
     {
         name = initName;
         price = initPrice;
     }// end multi
     
     public String getName()
     {
         return name;
        }// ennd getname
        
     public double getPrice()
     {
         return price;
        }
        
     public String toString()
     {
         return "Item: " + name + "\n" + "Price: $" + price + "\n";
     }
}// end class