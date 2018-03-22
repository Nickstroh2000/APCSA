public class Triangle extends Shape
{
    private int base;
    private int height;
    
    public Triangle()
    {
        super();
        base = 5;
        height = 6;
    }// end zero arg
    
    public Triangle( String initialColor, int initialBase, int initialHeight)
    {
        super( initialColor );
        base = initialBase;
        height = initialHeight;
    }// end two arg constructor
    
    public double calcArea()
    {
         return .5 * base * height;
    }// end calcArea
    
    public double calcHypotenuse()
    {
        return Math.sqrt( base*base + height*height );
    }// end calcHypotenuse()
    
    public double calcPerimeter()
    {
         return base + height + calcHypotenuse();
    }//end calcCircumference()
    
     public String toString()
    {
        return "Shape: Triangle \n" +  super.toString() + "Base: " + base +
                "\n" + "Height: " + height + "\n" + "Area: " + calcArea() +
                "\n" + "perimeter: " + calcPerimeter() + "\n";
    }// end toString
}// end Triangle