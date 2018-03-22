public class Rectangle extends Shape
{
    private int base;
    private int height;
    
    public Rectangle()
    {
        super();
        base = 10;
        height = 5;
    }// end zero arg
    
    public Rectangle( String initialColor, int initialBase, int initialHeight)
    {
        super( initialColor );
        base = initialBase;
        height = initialHeight;
    }// end two arg constructor
    
    public double calcArea()
    {
         return  base * height;
    }// end calcArea
    
    public double calcPerimeter()
    {
         return 2 * base + 2 * height;
    }//end calcCircumference()
    
     public String toString()
    {
        return "Shape: Rectangle \n" +  super.toString() + "Base: " + base +
                "\n" + "Height: " + height + "\n" + "Area: " + calcArea() +
                "\n" + "perimeter: " + calcPerimeter() + "\n";
    }// end toString
}// end Triangle