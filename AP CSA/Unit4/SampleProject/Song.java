public class Song 
{
    private String title;
    private int duration;
    private double price;
    private boolean isFavorite;
    
    public Song ()
    {
        title = "Nothing";
        duration = 00;
        price = 0.0;
        isFavorite = false;
    }//end zero arg
    
    public Song ( String initialTitle, int initialDuration, double initialPrice )
    {
        title = initialTitle;
        duration = initialDuration;
        price = initialPrice;
        isFavorite = false;
    }//
    
    public String getTitle ()
    {
        return title;
    }//end getTitle
    
    public int getDuration ()
    {
        return duration;
    }//end getduration
    
    public String convertSeconds()
    {
        int minutes = duration / 60;
        int seconds = duration % 60;
        if ( seconds < 10 )
        {
           return minutes + ":0" + seconds; 
        }//end if
        else
        {
           return minutes + ":" + seconds; 
        }// end else
    }// end convertSeconds
    
    public String toString()
    {
        return ( "Title: " + title + "\n" + "Duration: " + convertSeconds() + "\n" + "Price: "
                + price + "\n" + "isFavorite? " + isFavorite + "\n" );
    }// end toString
    
    
}// endd class song