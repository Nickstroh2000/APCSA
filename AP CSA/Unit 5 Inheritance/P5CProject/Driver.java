import java.util.ArrayList;

public class Driver
{
    public static void main( String[] args )
    {
        // setting up all menu items to choose from
        Sandwhich sandwich1 = new Sandwhich("Cheeseburger", 2.75);
        Sandwhich sandwich2 = new Sandwhich("Club Sandwich", 2.75);
        Salad salad1 = new Salad("Spinach Salad", 1.25);
        Salad salad2 = new Salad("Coleslaw", 1.25);
        Drink drink1 = new Drink("Orange Soda", 1.25);
        Drink drink2 = new Drink("Cappuccino", 3.50);
        
        ArrayList<MenuItem> menu = new ArrayList();
        menu.add( sandwich1 );
        menu.add( sandwich2 );
        menu.add( salad1 );
        menu.add( salad2 );
        menu.add( drink1 );
        menu.add( drink2 );
        
        System.out.println( "MENU CHOICES" );
        for ( MenuItem thing : menu )
        {
            System.out.println( thing );
        }
        
        Trio trio1 = new Trio( sandwich1, salad1, drink1 );
        Trio trio2 = new Trio( sandwich2, salad2, drink2 );
        
        System.out.println( "YOU PURCHASED" );
        System.out.println( trio1 );
        System.out.println( trio2 );
    }
}