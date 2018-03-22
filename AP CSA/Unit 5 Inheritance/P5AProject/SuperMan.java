public class SuperMan extends SuperHero
{
    private boolean inUniform;
    
    public SuperMan()
    {
        super( "Clark Kent" );
        inUniform = false;
    }// end zero arg
    
    public SuperMan(String initName, boolean initInUniform )
    {
        super( initName );
        inUniform = initInUniform;
    }// end multi arg
    
    
}// end superman