public class Soda
{
    private String name;
    private String type;
    private double cost;
    
    public Soda()
    {
        name = new String ("Coke");
        type = new String ("Can");
        cost = 0.99;
    }// end zero arg
    
    public Soda(String initialName, String initialType, double initialCost)
    {
        name = initialName;
        type = initialType;
        cost = initialCost;
    }// end multi arg
    
    public String getName()
    {
        return name;
    }
    
    public String getTpye()
    {
        return type;
    }// end getType
    
    public double getCost()
    {
        return cost;
    }// end getCost
    
    public String toString()
    {
        return name + "\t" + type + "\t" + cost + "\n";
    }
}// End Soda class