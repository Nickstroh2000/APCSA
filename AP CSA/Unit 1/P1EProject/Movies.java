// ARRAYS
// An array is a container that holds a fixed
 // number of values of the same type. The length 
 // is established when the array is created and
 // can't be changed.
 
 // CREATE AND INITIALIZE 
 // String[] myArray = new String[3];
 // myArray[0] = new String( "Easter egg" ); <- 1st  element
 // myArray[1] = new String( "cadbur egg" ); <- 2nd element
 // myArray[2] = new String( "Caviar" ); <- 3rd element
 // myArray[3] = new String( "rotten egg" ); <- OutOfBounds!
 
 // ATTRIBUTE
 // System.out.println( myArray.length ); <- prints out 3
 
 // WHILE LOOPS
 // different way to iterate/repeat.
 // It will continue as long as the condition is met.
 // int counter = 0;
 // while ( counter < #ofreps )
 // {
     // what you want to do repeatedly
     // counter++;
    // }
 
    
public class Movies
{
   public static void main (String[] args )
   {
       String[] favMovies = new String [3];
       favMovies[0] = new String ( "Star Wars" );
       favMovies[1] = new String ( "Lord of the Rings" );
       favMovies[2] = new String ( "heracles");
       
       String[] favSongs = new String[3];
       favSongs[0] = new String ( "song 1, " );
       favSongs[1] = new String ( "song 2, " );
       favSongs[2] = new String ( "song 3" );
       int counter = 0;
       
       for( int index = 0; index < favMovies.length; index++)
       {
           System.out.println( favMovies[index] );
           
        }//end for loop
        
       System.out.println();
       System.out.println();
       
       while(counter  < favSongs.length)
       {
           System.out.print( favSongs [counter] );
           counter++;
        }//end while
    }//end main method
}//end Movies class
