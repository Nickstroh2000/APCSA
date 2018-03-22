public class ShapeDriver
{
    public static void main( String[] args )
    {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("Circle", "Blue", 1, 2);
        Shape shape3 = new Shape("Square", "Red", 3, 4);
        Shape shape4 = new Shape("Triangle", "Yellow", 5, 6);
        
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println(shape4);
    }// end main
}// end class