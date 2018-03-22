public class Song
{
    // THE "BIG THREE"
    // 1. private instance variables
    private String title;
    private int duration; // in seconds
    private double cost;
    private boolean isFavorite;
    
    // 2. contructors 
    // zero argument constuctor sets starting value when none are given
    public Song()
    {
        title = new String ( "default song" );
        duration = 0;
        cost = 0.0;
        isFavorite = false;
    }// end of zero argument constuctor
    
    // multi argument constructor(s) allows the user to set starting values 
    public Song( String initialTitle, int initialDuration, double initialCost )
    {
        title = initialTitle;
        duration = initialDuration;
        cost = initialCost;
        isFavorite = false;
    }// end of multi arg constructor

    // 3.toString() method
    // override toString() to customize your output
    // public = visiblity
    // String = return type
    // toString = name of method
    public String toString()
    {
        return ( "Song Title " + title + "\n" + "Cost: $" + cost + "\n"
        + "Duration: " + convertSeconds() + "\n" + "Favorite? " + isFavorite + "\n" );
    }// end of toString method
    
    // The "Dynamic Duo"
    // # 4. getter (accessor) methods
    public String getTitle()
    {
        return title;
    }//end getTitle
    
    public String getDuration()
    {
        return convertSeconds();
    }//end getDuration
    
    public double getCost()
    {
        return cost;
    }//end getCost
    
    public boolean getIsFavorite()
    {
        return isFavorite;
    }// end getIsFavorite
    
    // 5. setter (mutator) methods
    public void setTitle( String newTitle )
    {
        title = newTitle;
    }// end setTitle
    
    public void setDuration( int newDuration )
    {
        duration = newDuration;
    }//end newDuration
        
    public void setCost( double newCost )
    {
        cost = newCost;
    }// end newCost
    
    public void makeFavorite()
    {
        isFavorite = true;
    }// end makeFavorite
    
    public void unFavorite()
    {
        isFavorite = false;
    }//end unFavorite
    
    // THE "BRAIN"
    // 6. processor method(s) - algorithmic processing
    public String convertSeconds()
    {
      int minutes;
      int seconds;
      
      minutes = duration / 60;
      seconds = duration % 60;
      
      return ( minutes + " min & " + seconds + " seconds" );
    }// end convertSeconds
    
}// end class Song