public class SportsTeam
{
    private String team;
    private int jerseyNum;
    private boolean isStarter;
    
    public SportsTeam()
    {
        team =  ( "Un Drafted" );
        jerseyNum = 0;
        isStarter = false;
    }// end zero arg constructor
    
    public SportsTeam( String initialTeam, int initialJerseyNum)
    {
        team = initialTeam;
        jerseyNum = initialJerseyNum;
        isStarter = false;
    }// end multi arg constructor
    
    public String toString()
    {
        return( "Team Name: " + team + "\n" + "Jersey Number: " + jerseyNum + 
        "\n" + "Is Starter? " + isStarter + "\n");
    }// end toString method
}//end classs SportsTeam