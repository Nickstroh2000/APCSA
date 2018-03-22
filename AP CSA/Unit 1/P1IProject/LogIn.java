// GETTING USER INPUT
// code vefore stating the class:
// import javax.swing.JOptionPane;

// Code in main method: 

// String input = JOptionPane.showInputDialog( "Text" );
// This code will pop up a window and wait for the user
 // to input a String. This String will be saved in the
 // variable called input. 
 
 import javax.swing.JOptionPane;
 
 public class LogIn
 {
     public static void main( String[] args )
     {
         //practice with JOptionPane with Mrs. Q
         //String nameInput = JOptionPane.showInputDialog( "What's your name?" );
         //System.out.println( "The users name is " + nameInput );
         
         String userName = new String ( "Nick Stroh" );
         String passWord = new String ( "1234" );
         String userNameInput = JOptionPane.showInputDialog( "User Name" );
         String passWordInput = JOptionPane.showInputDialog( "PassWord" );
         
         if( userNameInput.equals( userName ) )
         {
           
         }//end if
            else 
            {
                System.out.println( "Your user name was inncorrect" );
            }//end else
         
         if (passWordInput.equals ( passWord ) )
         {
            
         }//end if 
            else 
            {
                 System.out.println( "Your password was inncorrect" );
            }//end else
            
         if ( userNameInput.equals( userName ) && passWordInput.equals ( passWord )) 
         {
              System.out.println( "You logged in" );
         }//end if
        
     }//end main method
    }//end class