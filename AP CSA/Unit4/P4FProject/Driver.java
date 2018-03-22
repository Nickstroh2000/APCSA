public class Driver
{
    public static void main( String[] args )
    {
        
        VendingMachine quenchStation = new VendingMachine();
        System.out.println( "Current Inventory" );
        System.out.println( quenchStation );
        System.out.println( "______________________" ) ;
        quenchStation.purchaseSoda( "Coke", 2.00 );
        quenchStation.purchaseSoda( "Sprite", 1.75 );
        quenchStation.purchaseSoda( "Water", 2.0 );
        quenchStation.purchaseSoda( "Dr. Pepper", 1.00 );
        quenchStation.purchaseSoda( "Fanta", 1.50 );
        quenchStation.purchaseSoda( "Fanta", 0.50 );
        System.out.println( "______________________" ) ;
        System.out.println( "New Inventory" ) ;
        System.out.println( quenchStation );
    }
}