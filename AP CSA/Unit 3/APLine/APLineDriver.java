public class APLineDriver
{
    public static void main( String[] args )
    {
        APLine line1 = new APLine( 5, 4, -17 );
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine( 5, -2 );
    
        APLine line2 = new APLine( -25, 40, 30 );
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine( 5, -2 ); 
        
        System.out.println( "Line 1 is " + line1 );
        System.out.println( "Line ones slope is " + slope1 );
        System.out.println( "(5, -2 ) is on Line 1? " + onLine1 );
        
        System.out.println( "Line 2 is " + line2 );
        System.out.println( "Line twos slope is " + slope2 );
        System.out.println( "(5, -2 ) is on Line 1? " + onLine2 );
    }   
}//end class