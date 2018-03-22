import java.util.ArrayList;

public class Driver
{
    public static void main( String[] args )
    {
        WalkUp ticket1 = new WalkUp();
        Advance ticket2 = new Advance(10);
        Advance ticket3 = new Advance(9);
        StudentAdvance ticket4 = new StudentAdvance(10);
        StudentAdvance ticket5 = new StudentAdvance(9);
        
        ArrayList<Ticket> ticketList = new ArrayList();
        ticketList.add( ticket1 );
        ticketList.add( ticket2 );
        ticketList.add( ticket3 );
        ticketList.add( ticket4 );
        ticketList.add( ticket5 );
        
        for ( Ticket item : ticketList )
        {
            System.out.println( item );
        }
    }
}