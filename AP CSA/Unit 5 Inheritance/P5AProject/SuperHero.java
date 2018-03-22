public abstract class SuperHero
{
    private String name;
    
    public SuperHero()
    {
        name = new String ("Generic Man");
    }// end zero
    
    public SuperHero(String initName)
    {
        name = initName;
    }// end one arg
    
    public String sayMotto()
    {
        return "I'm " + name + "!\n";
    }// end sayMotto
}// end superhero