public class SportsTeamDriver
{
    public static void main( String[] args )
    {
        SportsTeam rookie = new SportsTeam();
        
        SportsTeam veteran = new SportsTeam( "Lakers", 20);
        
        System.out.println( rookie );
        System.out.println( veteran );
    }// end main method
}//end SportsTeamDriver class