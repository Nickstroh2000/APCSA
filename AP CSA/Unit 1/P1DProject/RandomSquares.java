// ITERATION
// for loops
 
// for ( int counter= 0; counter < #ofreps; counter++ )
// {
    // repeated actions
// }//end for loop

// RANDOM NUMBERS
// class math

// static double    random()
// Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.

public class RandomSquares
{
   public static void main ( String [] args )
   {
        System.out.println( "x" + "\t" + 
                            "x^2" + "\t" +
                            "included Int" );
       for ( int counter = 0; counter < 11; counter++ )
       {
            System.out.println( counter + "\t" + counter*counter +
            "\t" + (int)( Math.random()*(counter*counter - counter) + counter) ); 
            
            
        }
       
       
       //System.out.println( ( int ) ( Math.random()*5 ) );
       
    }//end main method
    
   
}//end RandomSquares class