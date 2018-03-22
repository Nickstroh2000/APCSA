public class MyPod
{
    private String color;
    private int capacity;
    private Song[] songLibrary;
    
    // zero arg
    public MyPod()
    {
        color = new String( "white" );
        capacity = 16;
        songLibrary = new Song[3];
        songLibrary[0] = new Song();
        songLibrary[1] = new Song();
        songLibrary[2] = new Song();
    }// end zero arg
    
    // multi arg
    public MyPod( String initialColor, int initialCapacity )
    {
        color = initialColor;
        capacity = initialCapacity;
        songLibrary = new Song[3];
        
        songLibrary[0] = new Song( "ABC", 200, 0.99 );
        songLibrary[1] = new Song( "MmmBop", 185, 0.50 );
        songLibrary[2] = new Song( "Hello", 215, 0.85 );
    }// multi arg
    
    public String toString()
    {
        String podInfo = new String();
        podInfo = "MyPod color: " + color + "\n" + "MyPod capacity: " + capacity + " GB"+ "\n\n" + "___Song Library___\n";
        String allTheSongs = new String();
        for( Song item : songLibrary )
        {
            allTheSongs = allTheSongs + item;
        }// end for each
        return podInfo + allTheSongs;
    }// end tostring
}//end MyPod class
