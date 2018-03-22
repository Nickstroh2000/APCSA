public class Senior extends Student
{
    private boolean goingToCollege;
    private String whatCollege;
    
    public Senior()
    {
        goingToCollege = false;
    }// end zero
    
    public Senior( String initName, int initGrade, boolean initGoingToCollege )
    {
        super( initName, 12, "Finally free!" );
        if( initGoingToCollege == true )
        {
            super.changeEmotion("gonna party... wait not I'm not I'm Jack");
        }// end if
    }// end multi
}// end class