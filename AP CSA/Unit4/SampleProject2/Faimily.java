import java.util.ArrayList;

public class Faimily
{
    public static void main( String[] args )
    {
        ArrayList<String> familyMembers = new ArrayList<String>();
        
        familyMembers.add( "Nick" );
        familyMembers.add( "Mom" );
        familyMembers.add( "Dad" );
        familyMembers.add( "Alex" );
        familyMembers.add( "Hayley" );
        
        System.out.println( "Number of family members: " + familyMembers.size() );
        System.out.println( "----------------------" );
        
        System.out.println( "Printing using the for loop" );
        for (int i = 0; i < familyMembers.size(); i++ )
        {
            System.out.println( familyMembers.get( i ) );

        }// end for loop
        System.out.println( "----------------------" );
         
        System.out.println( "Printing using the for each loop" );
        for ( String item : familyMembers )
        {
            System.out.println( item );
        }// end for each
    }// end main method
}// end clas