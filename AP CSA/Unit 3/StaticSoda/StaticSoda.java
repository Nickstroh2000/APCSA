public class StaticSoda 
{
    //each soda had these instance variables
    private String name;
    private double price;
    
    //each soda object shares this variable
    private static int sodaCount = 0;
    
    // zero arg constructor
    public StaticSoda()
    {
        name = "Dr. Pepper";
        price = 0.99;
        sodaCount++;
    }//end zero arg
    
    // getter/ accessor
    public static String getSodaCount()
    {
        return ( "There are " + sodaCount + " sodas" );
    }//end get
    
    // setter/ mutator
    public void buySoda()
    {
        sodaCount--;
        System.out.println( "Dispensing... " + name );
    }//end buySoda
    
    //toString
    public String toString()
    {
        return ( name + "\t" + "$" + price );
    }//end toString
}//end StaticSoda 