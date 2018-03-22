public class Circle extends Shape
{
    private int radius;
    private int diameter;
    
    public Circle()
    {
        super();
        radius = 5;
        diameter = radius * 2;
    }// end zero arg
    
    public Circle( String initialColor, int initialRadius)
    {
        super( initialColor );
        radius = initialRadius;
        diameter = initialRadius * 2;
    }// end two arg constructor
    
    public double calcArea()
    {
         return 3.14 * radius * radius;
    }// end calcArea
    
    public double calcCircumference()
    {
         return 2* 3.14 * radius;
    }//end calcCircumference()
    
    public String toString()
    {
        return "Shape: Circle \n" +  super.toString() + "Radius: " + radius +
                "\n" + "Diameter: " + diameter + "\n" + "Area: " + calcArea() +
                "\n" + "Circumference: " + calcCircumference() + "\n";
    }// end toString
}// end class Circle