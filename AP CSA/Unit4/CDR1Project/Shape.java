public class Shape
{
    private String type;
    private String color;
    private int base;
    private int height;
    private int radius;
    private int diameter;
    
    public Shape()
    {
        type = "Square";
        color = "Red";
        base = 5;
        height = 5;
    }// end zero arg
    
    public Shape( String initialType, String initialColor,
                     int dimention1, int dimention2 )
    {
        type = initialType;
        color = initialColor;
        if( type.equals("Circle"))
        {
            radius = dimention1;
            diameter = dimention2;
        }// end if
        else
        {
            base = dimention1;
            height = dimention2;
        }// end else
    }// end multiarg
    
    public String getType()
    {
        return type;
    }// end getType
    public String getColor()
    {
        return color;
    }// end getcolor
    public int getBase()
    {
        return base;
    }//end getBase
    public int getHeight()
    {
        return height;
    }//end getHeight
    public int getRadius()
    {
        return radius;
    }//end getRadius
    public int getDiameter()
    {
        return diameter;
    }//end getDiameter
    
    public void setType(String newType)
    {
        type = newType;
    }// end setType
    public void setColor(String newColor)
    {
        color = newColor;
    }// end setType
    public void setBase(int newBase)
    {
        base = newBase;
    }// end setType
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }// end setType
    public void setRadius(int newRadius)
    {
        radius = newRadius;
    }// end setType
    public void setDiameter(int newDiameter)
    {
        diameter = newDiameter;
    }// end setType
    
    public double calcHypotenuse()
    {
        int c = base*base + height*height;
        return Math.sqrt(c);
    }// end calcHypotenuse()
    
    public double calcArea()
    {
        if( type.equals("Square"))
        {
            return base * height;
        }// end if
        else if( type.equals("Triangle"))
        {
            return base/2 * height; 
        }// end else if 
        else
        {
            return 3.14 * radius * radius;
        }// end else
    }// end calcArea()
    
    public double calcPerimeter()
    {
        if( type.equals("Square"))
        {
            return base * 2 + height * 2;
        }// end if
        else if( type.equals("Triangle"))
        {
            return base + calcHypotenuse() * 2; 
        }// end else if 
        else
        {
            return 2* 3.14 * radius;
        }// end else
    }// end calcPerimeter()
    
    public String toString()
    {
        return( "I am a " + color + " " + type + " with: " + "\n" + "Base: " + base + "\n" +
                "Height: " + height + "\n" + "Area: " + calcArea() + "\n" + "Perimeter: " + calcPerimeter() + "\n");
    }// end toString()
}//end class Shape