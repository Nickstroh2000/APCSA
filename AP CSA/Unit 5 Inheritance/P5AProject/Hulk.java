public class Hulk extends SuperHero
{
    private boolean isHulk;
    
    public Hulk()
    {
        super( "Bruce Banner" );
        isHulk = false;
    }// end zero
    
    public Hulk( String initName, boolean initIsHulk )
    {
         super(initName);
         isHulk = initIsHulk;
    }// end multi
    
    public String sayMotto()
    {
        //String power ="";
        if(isHulk == true )
        {
            return "I'M HULK!!!";
        }// end if
        return super.sayMotto();
    }// end sayMotto
}// end class