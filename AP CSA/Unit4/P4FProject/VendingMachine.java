import java.util.ArrayList;
public class VendingMachine
{
    private ArrayList<Soda> startingInventory;
    public VendingMachine()
    {
        startingInventory = new ArrayList<Soda>();
        startingInventory.add( new Soda( "Coke", "bottle", 1.50 ) );
        startingInventory.add( new Soda( "Dr. Pepper", "can", 0.99 ) );
        startingInventory.add( new Soda( "Sprite", "bottle", 1.50 ) );
        startingInventory.add( new Soda( "Coke", "can", 0.99 ) );
        startingInventory.add( new Soda( "Diet Coke", "can", 0.99 ) );
        startingInventory.add( new Soda( "Fanta", "can", 0.99 ) );
        startingInventory.add( new Soda( "Coke", "bottle", 1.50 ) );
        startingInventory.add( new Soda( "Dr. Pepper", "can", 0.99 ) );
    }// end zero arg 
    
    public void purchaseSoda( String name, double inputMoney)
    {
        Soda foundSoda = findSoda( name );
        
        if ( foundSoda == null )
        {
            System.out.println( "The soda you're looking for is out of stock " );
        }
        else
        {
            if ( foundSoda.getCost() < inputMoney )
            {
                System.out.println( "Your change is: " + calcChange(foundSoda.getCost(), inputMoney) );
                startingInventory.remove( foundSoda );
            }// end if
            else
            {
                System.out.println( "You don't have enough money!" );
            }
        }
        
    }// end purchaseSoda
    
    public Soda findSoda( String name )
    {
        for( Soda item: startingInventory )
        {
            if ( item.getName().equals( name ) )
            {
                return item;
            }
        }// end for each
        return null;
    }// end findSoda
    
    // public void removeSoda( String name )
    // {
        // for( int i = 0; i < startingInventory.size(); i++ )
        // {
            // if( startingInventory.get(i).getName().equals( name ) )
            // {
                // startingInventory.remove(i);
                // i--;
            // }// end if
        // }// end for
    // }// end removeSoda
    
    public String calcChange( double cost, double inputMoney )
    {
        int convertCost = (int) (cost * 100);
        int convertInput = (int) (inputMoney * 100);
        int change = convertInput - convertCost;
        int dollar = 0;
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;
        while( change > 100 )
        {
            change = change - 100;
            dollar++;
        }// end while
        while( change > 25 )
        {
            change = change - 25;
            quarter++;
        }// end while
        while( change > 10 )
        {
         change = change - 10;
         dime++;
        }
        while( change > 5 )
        {
            change = change - 5;
            nickel++;
        }// end while
        while( change > 1 )
        {
            change = change - 1;
            penny++;
        }// end while
        return( "Dollars: " + dollar + "\n" 
                + "Quarters: " + quarter + "\n"
                + "Dimes: " + dime + "\n"
                + "Nickels: " + nickel + "\n"
                + "Pennies: " + penny + "\n" );
    }// end calcChange
    
    
    
    public String toString()
    {
        String output = new String("");
        for ( Soda item : startingInventory )
        {
            output = output + item;
        }
        return output;
    }
}// end class VendingMachine