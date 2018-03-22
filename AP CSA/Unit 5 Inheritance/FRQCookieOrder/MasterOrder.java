import java.util.ArrayList;
import java.util.List;
public class MasterOrder
{
    private List<CookieOrder> orders;
    
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }// end zero
    
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }// end add
    
    public int getTotalBoxes()
    {
        int sum = orders.size();
        return sum;
    }// end totalGetBoxes
    
    public int removeVariety(String cookieVar)
    {
        int numBoxes = 0;
        for( int i = 0; i < orders.size(); i++ )
        {
           if(orders.get(i).getVariety().equals(cookieVar))
           {
               numBoxes += orders.get(i).getNumBoxes();
               orders.remove(i);
               i--;
           }
        }
        return numBoxes;
    }// end removeVariety
    
    public String toString()
    {
        String result =new String("");
        for(CookieOrder item: orders)
        {
            result += item.getVariety() + " " + item.getNumBoxes()+ "\n";
        }
        return result;
    }
}// end class