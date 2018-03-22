import javax.swing.JOptionPane;
public class WarGameDriver
{
    public static void main( String[] args )
    {
       String input = JOptionPane.showInputDialog
                       ( "How many rounds do you want to play? " );
       int numRounds = Integer.parseInt( input );
       int winSum1 = 0;
       int winSum2 = 0;
        
       for( int index = 1; index < numRounds + 1; index++ )
       {
           Card warCard1A = new Card();
           Card warCard2A = new Card();
           System.out.println( "--Round " + index + "--" + "\n" + "P1: "
                            + warCard1A + " vs. " + "P2: " + warCard2A );
                            
           if( warCard1A.getValue() > warCard2A.getValue() )
       {
           System.out.println( "--PLAYER 1 WINS!--" + "\n" );
           winSum1++;
       }//end if 
       else if (warCard1A.getValue() < warCard2A.getValue() )
       {
           System.out.println( "--PLAYER 2 WINS!--" + "\n" );
           winSum2++;
        }//end else if
       else
       {
           System.out.println( "IT'S A TIE--" + "\n" );
        }//end else
      
    }//end for loop
    
    System.out.println( "--FINAL SCORE--" + "\n" +
                            "Player 1: " + winSum1 + "\t" + "Player 2: " + winSum2 );
                            
    if( winSum1 > winSum2 )
    {
        System.out.println( "--PLAYER 1 WINS THE GAME!--" ); 
    }//end for loop
    else
    {
        System.out.println( "--PLAYER 2 WINS THE GAME!--" );
    }//end else
    }//end main method
}//end class WarGameDriver)