import javax.swing.JOptionPane;
public class SimpleSearch
{
    public static void main( String[] args )
    {
        String search =  JOptionPane.showInputDialog  ( "pick a random number " );
                                          
        int searhFor = Integer.parseInt ( search );
        int[] randNums = new int [10] ;
        for (int index = 0; index < randNums.length; index++ )
        {
            randNums[index] = ( int )( Math.random()*100 );
            System.out.println ( randNums[index] );
        }
        
        int location = -1;
        for ( int index = 0; index < randNums.length ; index ++)
        {
            
            if (randNums[index] == searhFor)
            {
               location = index;
            }// end if 
            
        }// end for
        System.out.println ( "\n" + location );
    }// end main method
}// end class SimpleSearch