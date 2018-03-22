public class Square extends Rectangle
{
    
    public Square()
    {
        super("Red",5,5);
    }// end zero arg
    
    public Square(String initialColor, int sideLength)
    {
        super( initialColor, sideLength, sideLength );
        
    }// end multi arg
   
    public String toString()
    {
        return "Shape: Square which is also a \n" + super.toString();
    }// end toString
}// end Square