public abstract class Shape
{
    private String color;
    
    public Shape()
    {
        color = new String("red");
    }// end zero arg
    
    public Shape(String initialColor)
    {
        color = initialColor;
    }// end one arg
    
    public String toString()
    {
        return "Color: " + color + "\n";
    }// end toString
    
}// end shape