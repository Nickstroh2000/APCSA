 public class TokenPass
 {
    private int[] board;
    private int currentPlayer;
    
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        
        for(int value : board)
        {
           value = (int) (Math.random() * 10 + 1);
        }
        currentPlayer = (int) (Math.random() * playerCount);
    }// end muli
    
    public void distributeCurrentPlayerTokens()
    {
        int tokens = board[currentPlayer];
        board[currentPlayer] = 0;
        int passTo = currentPlayer+1;
        // for ( int i = tokens; i >= 0; i--)
        // {
            // if (count== board.length - 1)
            // {
                // count = 0;
                // board[count] = board[count] + 1;
            // }
            // else
            // {
                // board[count] = board[count + 1] + 1;
                // count++;
            // }
        // }
       
        while (tokens > 0)
        {
             // check if we're out of bounds, if so...make passTo = 0
             if (passTo >= board.length)
             {
                 passTo = 0;
             }
             board[passTo]++;
             tokens--;
        }// end while
    }
   
    
    public String toString()
    {
         String output = new String( "BOARD\n| " );
         for ( int i = 0; i < board.length; i++ )
         {
            output += board[i] + " | ";
         }
         output += "\nCurrent Player: " + currentPlayer + "\n";
         return output;
    } // end toString method
}
