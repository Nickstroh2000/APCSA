public class Trio implements MenuItem
{
    private Sandwhich sandWhichPick;
    private Salad saladPick;
    private Drink drinkPick;
    
    public Trio( Sandwhich initSandWhichPick, Salad initSaladPick, Drink initDrinkPick )
    {
        sandWhichPick = initSandWhichPick;
        saladPick = initSaladPick;
        drinkPick = initDrinkPick;
    }// end multi
    
    public String getName()
    {
        return sandWhichPick.getName() + "/" + saladPick.getName() + "/" + drinkPick.getName() + " Trio";
    }
    
    public double getPrice()
    {
        if( sandWhichPick.getPrice() <= saladPick.getPrice() && sandWhichPick.getPrice() >= drinkPick.getPrice() )
        {
            return sandWhichPick.getPrice() + saladPick.getPrice();
        }
        else if( sandWhichPick.getPrice() >= saladPick.getPrice() && saladPick.getPrice() <= drinkPick.getPrice() )
        {
            return sandWhichPick.getPrice() + drinkPick.getPrice();
        }
        else
        {
            return saladPick.getPrice() + drinkPick.getPrice();
        }
    }
    
    public String toString()
     {
         return "Item: " + getName() + "\n" + "Price: $" + getPrice() + "\n";
     }
}// end class

