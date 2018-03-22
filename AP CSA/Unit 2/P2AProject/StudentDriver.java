import javax.swing.JOptionPane;
public class StudentDriver
{
    public static void main( String[] args )
    {
        // 4. 
        
        Student senior001 = new Student();
        
        Student freshman001 = new Student( "Nick", "Stroh", 310672, 9);
        String input = JOptionPane.showInputDialog( "Do you have an ASB card? 1 = yes, 0 = no" );
        int yesOrNo = Integer.parseInt(input);
        if ( yesOrNo == 1 )
        {
            freshman001.setASB( true );
        }//end if
        
        System.out.println( senior001 );
        System.out.println( freshman001 );
    }// end main method
}//end Student Driver class