//Nick Stroh
import javax.swing.JOptionPane;
public class DailyTemperatures
{
    public static void main( String[] args )
    {
        // #1: get user imput 
        String input = JOptionPane.showInputDialog( "How many days do you want to view? " );
        int numDays = Integer.parseInt( input );
        // #2: 1st array ( dates )
        int[] dates = new int [numDays];
        // #4: 2nd array ( dailyTemps )
        int[] dailyTemps = new int [numDays];
        // #6: 3rd array ( forecast )
        String[] forecast = new String [numDays];
        
        // #3: 1st for loop ( populating dates )
        for( int index = 0; index < numDays; index++ )
        {
            dates[index] = index + 1;
        }//end for loop
        
        // #5: 2nd for loop( populateing daily temps )
        for( int index = 0; index < numDays; index++ )
        {
            dailyTemps[index] = ( int ) ( Math.random()* 200 - 100 );
        }//end for loop
        
        // #7: 3rd for loop ( populating forecast )
        for( int index = 0; index < numDays; index++ )
        {
                 if ( dailyTemps[index] >= 80 )
            {
                 forecast[index] = new String ( "Hot!" );
            }//end if
            
             if ( dailyTemps[index] >= 50 && dailyTemps[index] < 80 )
            {
                 forecast[index] = new String ( "Moderate" );
            }//end if
            
             if ( dailyTemps[index] >= 30 && dailyTemps[index] < 50 )
            { 
                 forecast[index] = new String ( "Cold" );
            }//end if
            
             if ( dailyTemps[index] < 32 )
            {
                 forecast[index] = new String ( "Freezing!" );
            }//end if
        }//end for loop
        
        // #8: print titles
        System.out.println( "\tDaily Temperatures for October 2020" );
        System.out.print( "Date\t" );
        System.out.print( "Daily Temperature\t" );
        System.out.println( "Forecast\t" );
        
        // #9: 4th for loop ( output table )
        for( int index =0; index < numDays; index++ )
        {
            System.out.println( dates[index] + "\t\t" + dailyTemps[index]
            + "\t\t" + forecast[index] );
        }//end for loop
    }//end main method
}//end DailyTemperatures class