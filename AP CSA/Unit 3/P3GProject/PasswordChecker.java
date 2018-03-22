import javax.swing.JOptionPane;
public class PasswordChecker
{
    public static void main( String[] args )
    {
        
        
        
        boolean isGood = false;
        
        while (isGood != true )
        {
            String input = JOptionPane.showInputDialog( "Write a password with at least 6 characters and at least one non-alphanumeric character" );
            if (input.length() >= 6 )
            {
                for( int index = 0; index < input.length(); index ++ )
                {
                    String letter = input.substring( index, index+1 );
                    if ( letter.equals( "+" ) || letter.equals( "-" ) || letter.equals( "*" ) || letter.equals( "/" ) || letter.equals( "@" ) )
                    {
                        isGood = true;
                    }//end if 
                }
            }

        }//end while
        
    }//end main method
}//end class PasswordChecker 