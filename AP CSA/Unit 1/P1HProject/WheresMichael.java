// STRING METHODS
// Strings are objects which have some 
// predefined methods/functions you can use.

// String phrase = new String( "AP Comp Sci A");

// LENGTH OF A STRING
// phrase.length() <-- will return 13

// SUBSTRING
// phrase.substring(7) <-- will return first 7 
                        // characters of phrase
                        // "AP Comp"

// CHECKING THE EQUALITY OF STRINGS
// Do NOT use == <-- compares memory location not stuff
// phrase.equals( "AP CompSci A" ) <-- returns false
// phrase.equals( "AP Comp Sci A" ) <-- returns true

public class WheresMichael
{
    
    public static void main( String[] args )
    {
        String[] artists = new String[4];
            artists[0] = new String( "Janet Jackson" );
            artists[1] = new String( "Michael Jackson" );
            artists[2] = new String( "Janet Jackson" );
            artists[3] = new String( "Jack Johnson");
            
        String searchFor = new String( "Michael Jackson" );

        for( int index = 0; index < artists.length; index++)
        {
         if(artists[index].equals( searchFor ) )
         {
             System.out.println( "I found " + searchFor );
            }//end if
            else
            {
               System.out.println( "I didn't find " + searchFor ); 
            }//end else
        }
    }//end main method
}//end class