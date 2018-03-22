public class Clock
{
    //private instance variables 
    private int hours;
    private int minutes;
    private int seconds;
    
    // zero arg constructor
    public Clock()
    {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }// end zero arg constructor
    
    // multi arg constructor
    public Clock( int initialHours, int initialMinutes, int initialSeconds )
    {
        hours = initialHours;
        minutes = initialMinutes;
        seconds = initialSeconds;
    }// end multi arg constructor
    
    public String toString()
    {
        return ( "The time is " + hours + ":" + minutes + ":" + seconds + "\n"
                + "This is a total of " + totalSeconds() + " Seconds" );
        
    }//end toString
    
    // setter method called setTime
    public void setTime( int newHours, int newMinutes, int newSeconds )
    {
        hours = newHours;
        minutes = newMinutes;
        seconds = newSeconds;
    } // end setter method
    
    // method convertDaylightSavings
    //parameter 1 for "Spring Forward"
    //parameter -1 for "Fall Back"
    
    public void convertDaylightSaving( int hourChange )
    {
        hours = hours + hourChange;
    }// end convertDaylightSavings
    
    public int totalSeconds()
    {
        int sumOfAllSeconds = 0;
        sumOfAllSeconds = ( hours * 60 * 60 ) + ( minutes * 60) + seconds;
        return sumOfAllSeconds;
    }
}//end class Clock