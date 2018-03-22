public class StudentAdvance extends Advance
{
 
    public StudentAdvance(int initDays)
    {
        super(initDays);
        
    }// end multi
    
    public double getPrice()
    {
        return super.getPrice() / 2;
    }
    
    public String toString()
    {
        return super.toString() + "(Student ID required)" + "\n";
    }// end toString
}