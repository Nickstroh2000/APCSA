public class Driver
{
    public static void main ( String[] args )
    {
        TokenPass game1 = new TokenPass(5);
        System.out.println( "GAME 1\n" );
        System.out.println( "Start: " + game1 );
        game1.distributeCurrentPlayerTokens();
        System.out.println( "After Move 1: " + game1 );
        game1.distributeCurrentPlayerTokens();
        System.out.println( "After Move 2: " + game1 );
        game1.distributeCurrentPlayerTokens();
        
        TokenPass game2 = new TokenPass(8);
        System.out.println( "\n\nGAME 2\n" );
        System.out.println( "Start: " + game2 );
        game2.distributeCurrentPlayerTokens();
        System.out.println( "After Move 1: " + game2 );
        game2.distributeCurrentPlayerTokens();
        System.out.println( "After Move 2: " + game2 );
        game2.distributeCurrentPlayerTokens();
    }
}

