import javax.swing.JOptionPane;
import java.util.ArrayList;
public class MyPod
{
    private String color;
    private int capacity;
    private ArrayList<Song> songList = new ArrayList<Song>();
    
    public MyPod ()
    {
        color = ( "white" );
        capacity = 8;
    }// end 0 arg
    
    public MyPod( String initialColor, int initialCapacity )
    {
        int numberOfSongs = Integer.parseInt( JOptionPane.showInputDialog( "How many songs?" ) );
        color = initialColor;
        capacity = initialCapacity;
        
        for ( int i = 0; i < numberOfSongs; i++ )
        {
            songList.add( new Song( JOptionPane.showInputDialog( "Song name?" ) ) );
        }// end for
    }// end maulti arg
    
    public String toString()
    {
        String allTheSongs = new String();
        String songInfo = "Color: " + color + "\n" + "Capacity: " + capacity + "\n" + "Song List: " + "\n";
        for( Song item : songList )
        {
            allTheSongs = allTheSongs + item;
        }// end for each
        return( songInfo + allTheSongs );
    }
}// end clasO