public class ClockStore 
{
    private Clock[] clocksInStock;
    
    public ClockStore()
    {
        clocksInStock = new Clock[3];
        clocksInStock[0] = new Clock( 8, 10, 50 );
        clocksInStock[1] = new Clock( 2, 5, 00 );
        clocksInStock[2] = new Clock( 1, 35, 16 );
    }// end zero arg
    
    public int mostSeconds()
    { 
            if( clocksInStock[0].totalSeconds() > clocksInStock[1].totalSeconds() &&
                clocksInStock[0].totalSeconds() > clocksInStock[2].totalSeconds() )
            {
                return( 0 );
            }
            else if( clocksInStock[0].totalSeconds() < clocksInStock[1].totalSeconds() &&
                    clocksInStock[1].totalSeconds() > clocksInStock[2].totalSeconds() )
            {
                return( 1 );
            }// end else if 
            else
            {
                return( 2 );
            }// end else
    }// end mostSeconds()
    
    public String toString()
    {
        String allClocks = new String();
        for( Clock item: clocksInStock )
        {
            allClocks = allClocks + item;
        }// end foreach
        return( allClocks + "The biggest clock is at index " + mostSeconds() );
    }// end toString
}// end ClockStore class