public class RightTriangleDriver
{
    public static void main( String[] args )
    {
        // #10a
        RightTriangle triangle1 = new RightTriangle();
        //10c
        RightTriangle triangle2 = new RightTriangle( 3, 4 );
        
        // #10b
        System.out.println( triangle1 );
        System.out.println( "\n" );
        //10d
        System.out.println( triangle2 );
        System.out.println( "\n" );
      
        // #10e
        triangle2.setBase( 6 );
        // #10f
        System.out.println( triangle2 );
    }//end main method
}