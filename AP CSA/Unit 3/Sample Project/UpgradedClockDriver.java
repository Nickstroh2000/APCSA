import javax.swing.JOptionPane;
public class UpgradedClockDriver 
{
    public static void main ( String[] args )
    {
        Clock upgradedClock = new Clock();
        System.out.println( upgradedClock );
        
        //getting user input to set upgradedClock
        int hoursInput = Integer.parseInt ( JOptionPane.showInputDialog 
                                           ( "What is the curent hour? " ));                        
        int minutesInput = Integer.parseInt ( JOptionPane.showInputDialog 
                                               ("What is the curent minute? " ));
        int secondsInput = Integer.parseInt ( JOptionPane.showInputDialog  
                                               ( "What is the curent second? " ));
                                               
        // setting upgradedClock using user input
        upgradedClock.setTime( hoursInput, minutesInput, secondsInput );
        System.out.println( upgradedClock );
        
        //title for "Fall Back"
        System.out.println( "It's time to FALL BACK!" );
        upgradedClock.convertDaylightSaving( -1 );
        System.out.println( upgradedClock );
    }//end main method
}//end class UpgradedClockDriver