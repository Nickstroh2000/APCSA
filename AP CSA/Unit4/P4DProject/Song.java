public class Song 
{
    private String title;
    private boolean isFavorite;
    
    public Song ()
    {
        title = "Nothing";
        isFavorite = false;
    }//end zero arg
    
    public Song ( String initialTitle )
    {
        title = initialTitle;
        isFavorite = false;
    }//
    
    public String getTitle ()
    {
        return title;
    }//end getTitle
    
    public String toString()
    {
        return ( "Title: " + title + "\n" + "isFavorite? " + isFavorite + "\n" );
    }// end toString
}// endd class song