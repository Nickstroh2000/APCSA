public class Advance extends Ticket
{
    private double price;
    private int days;
    
    
    public Advance(int initDays)
    {
        super();
        days = initDays;
        if( days >= 10 )
        {
            price = 30.0;
        }// end if
        if( days < 10 )
        {
            price = 40.0;
        }// end if
    }// end multi
    
    public double getPrice()
    {
        return price;
    }
}// end Advance