public class VendingMachine
{
    public static void main( String[] args )
    {
        System.out.println( StaticSoda.getSodaCount() );
        System.out.println( "Filling the machine...\n" );
        
        StaticSoda[] inventory = new StaticSoda[10];
        
        for( int index = 0; index < inventory.length; index++ )
        {
            inventory[index] = new StaticSoda();
        }//end for
        
        //for each soda item in the inventory array, print
        for( StaticSoda item : inventory )
        {
            System.out.println( item );
        }//end for each
        System.out.println( StaticSoda.getSodaCount() );
        inventory[4].buySoda(); 
        System.out.println( StaticSoda.getSodaCount() );
    }//end main method
}//end VendingMachine class