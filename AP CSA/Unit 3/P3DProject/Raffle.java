public class Raffle
{
    public static void main( String[] args )
    {
        String[] studentNames = {"Nick A", "Kaylie", "Jack", "Chris", "Dawson", "Damian",
                                "Quinton", "Kyle", "Nolan", "Felix", "Tyler", "Dennis",
                                 "Nick S", "Raf", "Joe", "Grant", "Filip", "Tim", "Leona",
                                 "Victor"};
                                 
        String myName = new String( "Nick S" );
        
        
        for( int index = 0; index < 5; index++ )
        {
            String winnersName = studentNames[( ( int )( Math.random()*20 ))];
            System.out.println( "Raffle # " + ( index + 1 ) );
            System.out.println( "The winner is " + winnersName );
            if( myName.compareTo( winnersName ) == 0 )
            {
                System.out.println( "I am the Winner" + "\n" );
            }//end if
            else
            {
                System.out.println( "I am not the winner" + "\n" );
            }// end else
        
        }// end for
        
        
        
        
    }//end main method
}//end Raffle class