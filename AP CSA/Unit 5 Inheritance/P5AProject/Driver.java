import java.util.ArrayList;
public class Driver
{
    public static void main( String[] args )
    {
        ArrayList<SuperHero> superHeroList = new ArrayList();
        
        
        SuperHero b = new SuperMan("Iron Man", true);
        SuperHero c = new GreenArrow("GreenArrow", false);
        SuperHero d = new Hulk();
        
        
        superHeroList.add( b );
        superHeroList.add( c );
        superHeroList.add( d );
        
        for( SuperHero item: superHeroList )
        {
            System.out.println("-------------NEXT superHero------------ \n");
            System.out.println( item.sayMotto() );
        }// end for
    }
}// end Driver