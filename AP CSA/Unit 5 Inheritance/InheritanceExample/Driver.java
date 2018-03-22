import java.util.ArrayList;
public class Driver
{
    public static void main( String[] args )
    {
        ArrayList<Shape> shapeList = new ArrayList();
        
        
        Shape b = new Circle("blue", 5);
        Shape c = new Square("Maroon", 9);
        Rectangle d = new Rectangle();
        
        shapeList.add( new Triangle("Yellow", 5, 12));
        shapeList.add( b );
        shapeList.add( c );
        shapeList.add( d );
        
        for( Shape item: shapeList )
        {
            System.out.println("-------------NEXT SHAPE------------ \n");
            System.out.println( item );
        }// end for
    }// end main
}// end driver