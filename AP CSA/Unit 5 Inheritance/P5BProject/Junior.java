public class Junior extends Student
{
    private boolean isTired;
    
    public Junior()
    {
        isTired = true;
    }// end zero
    
    public Junior( String initName, int initGrade, boolean initIsTired )
    {
        super( initName, 11, "insane" );
        if( initIsTired == false )
        {
            super.changeEmotion("responsible :(");
        }// end if
    }// end multi
}// end class