public class Card
{
    // 1. create provate instrance variables
    private String name;
    private String suit;
    private int value;
    
    private String[] possibleNames = {"Ace", "2", "3", "4", "5", "6",
                                        "7", "8", "9", "10", "Jack", "Queen", "King" };
    private String[] possibleSuits = {"Diamonds", "Clubs", "Hearts", "Spades"};
    
    // 2. zero arg constuctor
    public Card()
    {
        int randomOutOf13 = ( int ) ( Math.random() * 13 );   
        int randomOutOf4 = ( int ) ( Math.random() * 4 ) ;
     
        name = possibleNames[randomOutOf13];
        suit = possibleSuits[randomOutOf4];
     
         if( name.equals( "Ace" ) )
        {
            value = 11;
        }// end if
        
        else if( name.equals( "Jack" ) ||name.equals( "Queen" ) || name.equals( "King" ) )
            {
            value = 10;
            }//end if
        else
        {
            value = Integer.parseInt( name );
        }// end else

    }//end zero arg method

    // 3. toSting() method 
    public String toString()
    {
        return ( name + " of " + suit );
    }//end toString method
    
    public int getValue()
    {
        return value;
    }//end getValue
}//end class Card