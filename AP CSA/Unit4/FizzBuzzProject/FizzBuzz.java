import javax.swing.JOptionPane;
public class FizzBuzz
{
    public static void main( String[] args )
    {
       game(30);
       game(55);
       String input = JOptionPane.showInputDialog("Pick a random number");
       int updateInput = Integer.parseInt(input);
       game(updateInput);
    }// end main method
    public static void game(int num)
    {
           for( int i = 1; i <= num; i++ )
       {
           if( i % 15 == 0 )
           {
               System.out.println("FizzBuzz");
            }//end if
           else if( i % 3 == 0 )
           {
               System.out.println("Fizz");
           }// end else if 
           else if( i % 5 == 0 )
           {
               System.out.println("Buzz");
           }// end else if
           else
           {
               System.out.println(i);
           }// end else
       }// end for
       System.out.println("--------------------------------------------------");
    }// end mod
  }// end class
