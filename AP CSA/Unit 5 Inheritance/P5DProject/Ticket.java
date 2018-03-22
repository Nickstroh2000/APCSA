public abstract class Ticket
{
    private int serialNumber; // unique ticket id number
    
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }
    
    public abstract double getPrice();
    
   // returns a string with information about the ticket
    public String toString()
    {
        return "Number: " + serialNumber + "\n" +
               "Price: $" + String.format("%.2f",getPrice()) + "\n";
    }
    
    // returns a new unique serial number
    private int getNextSerialNumber()
    {
        int tempSerialNumber = (int) ( Math.random() * 1000 );
        if ( tempSerialNumber != serialNumber )
        {
            return tempSerialNumber;
        }
        else
        {
            return tempSerialNumber + 1;
        }
    }
}
