public class CookieOrder
{
    private String variety;
    private int numBoxes;
    public CookieOrder(String initVariety, int initNumBoxes)
    {
        variety = initVariety;
        numBoxes = initNumBoxes;
    }// end multi arg
    
    public String getVariety()
    {
        return variety;
    } // end getVariety
    
    public int getNumBoxes()
    {
        return numBoxes;
    }
}// end class