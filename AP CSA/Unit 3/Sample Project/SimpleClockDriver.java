import javax.swing.JOptionPane;

public class SimpleClockDriver
{
    public static void main( String[] args )
    {
        Clock kitchenClock = new Clock();
        System.out.println( kitchenClock );
         
        int hoursInput = Integer.parseInt ( JOptionPane.showInputDialog 
                                           ( "What is the curent hour? " ));
                                           
        int minutesInput = Integer.parseInt ( JOptionPane.showInputDialog 
                                               ("What is the curent minute? " ));
                                               
        int secondsInput = Integer.parseInt ( JOptionPane.showInputDialog  
                                               ( "What is the curent second? " ));
       
        Clock officeClock = new Clock( hoursInput, minutesInput, secondsInput );
        
        System.out.println( officeClock );
        
        
    }// end main method
}//end class