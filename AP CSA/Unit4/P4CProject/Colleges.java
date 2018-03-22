import java.util.ArrayList;
public class Colleges 
{
    public static void main( String[] args )
    {
        ArrayList<String> collegeNames = new ArrayList<String>();
        
        collegeNames.add( "UCLA" );
        collegeNames.add( "UCSB" );
        collegeNames.add( "SDSU" );
        collegeNames.add( "UCSD" );
        collegeNames.add( "Cal Poly Slo" );
        collegeNames.add( "Harvard" );
        collegeNames.add( "MIT" );
        collegeNames.add( "USC" );
        
        for( String item: collegeNames )
        {
            System.out.println( item );
        }// end for each
        
        for( int i =0; i < collegeNames.size(); i++ )
        {
            if( collegeNames.get(i).length() == 4 )
            {
                collegeNames.remove(i);
                i--;
            }// end if
        }// end for
        
        System.out.println( "\nI now have " + collegeNames.size() + " colleges in my list" );
        
         for( String item: collegeNames )
        {
            System.out.println( item );
        }// end for each
    }// end main 
}// emd class