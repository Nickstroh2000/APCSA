public class GreenArrow extends SuperHero
{
    private boolean hasArrows;
    
    public GreenArrow()
    {
        super( "GreenArrow" );
        hasArrows = false;
    }// end zero
    
    public GreenArrow( String initName, boolean initHasArrows )
    {
         super(initName);
         hasArrows = initHasArrows;
    }// end multi
    
    public String sayMotto()
    {
        //String power ="";
        if(hasArrows == false )
        {
            return "I have no powers :(";
        }// end if
        return super.sayMotto();
    }// end sayMotto
}// end class