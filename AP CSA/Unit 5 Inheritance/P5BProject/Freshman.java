public class Freshman extends Student
{
    private boolean hasStyle;
    
    public Freshman()
    {
        hasStyle = false;
    }// end zero
    
    public Freshman( String initName, int initGrade, boolean initHasStyle)
    {
        super( initName, 9, "super lame" );
        
        if ( initHasStyle == true )
        {
            super.changeEmotion( "super dope bro " );
        }// end if
    }// end one arg
    
    
}// end class