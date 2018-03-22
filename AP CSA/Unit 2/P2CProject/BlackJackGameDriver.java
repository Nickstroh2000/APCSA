public class BlackJackGameDriver
{
    public static void main( String[] args )
    {
        Card card1A = new Card();
        Card card1B = new Card();
        
        Card card2A = new Card();
        Card card2B = new Card();
        
        int p1Sum = card1A.getValue() + card1B.getValue();
        int p2Sum = card2A.getValue() + card2B.getValue();
        
        System.out.println( "player 1 has: " + "\t" + "\t" + "Player 2 has: " );
        System.out.println( card1A + "\t" + "\t" + card2A );
        System.out.println( card1B + "\t" + "\t" + card2B );
        System.out.println( "For a total of: " + p1Sum + "\t" + "For a total of: " + p2Sum );
        
        
        if( p1Sum < p2Sum )
        {
            System.out.println( "\n" + "\t" + "\t" + "Player 2 Wins" );
        }//end if
        
        if( p1Sum > p2Sum )
        {
             System.out.println(  "\n" + "\t" + "\t" + "Player 1 Wins" );
        }//end if
        
        if( p1Sum == p2Sum )
        {
            System.out.println(  "\n" + "\t" + "\t" + "It's a tie" );
        }//end if
        
    }//end main method
}//end class BlackJackGameDriver