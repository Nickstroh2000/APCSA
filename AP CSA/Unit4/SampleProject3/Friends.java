import java.util.ArrayList;
public class Friends
{
    public static void main( String[] args )
    {
        ArrayList<String> friendsList = new ArrayList<String>();
        
        friendsList.add( "Nick" );
        friendsList.add( "Omar" );
        friendsList.add( "Mia" );
        friendsList.add( "Ash" );
        friendsList.add( "Lucas" );
        friendsList.add( "Sophie" );
        friendsList.add( "Rosie" );
        friendsList.add( "Ella" );
        
        System.out.println( "I have " + friendsList.size() + " friends" );
        for( String item : friendsList )
        {
            System.out.println( item );
        }// end for each
        
        for( int i = 0; i < friendsList.size(); i++ )
        {
            if( friendsList.get(i).length() > 5 )
            {
                friendsList.remove(i);
                i--;
            }// end if 
            
        }// end for
        
        System.out.println( "\n" + "I now have " + friendsList.size() + " friends" );
        for( String item: friendsList )
        {
            System.out.println( item );
        }// end for each
    }// end main
}// end class 