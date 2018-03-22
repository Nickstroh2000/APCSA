public class RightTriangle 
{
    // #1
    private int baseLength;
    private int heightLength;
    
    // #2 
    public RightTriangle ()
    {
        baseLength = 0;
        heightLength = 0;
    }//end zero arg
    
    // #3
    public RightTriangle ( int initialBaseLength, int initialHeightLength )
    {
        baseLength = initialBaseLength;
        heightLength = initialHeightLength;
    }// end multi arg
    
    // #4 
    public int getBase()
    {
        return baseLength;
    }// end getBase
    
    // #5
    public void setBase( int newBaseLength )
    {
        baseLength = newBaseLength;
    }// end 
    
    // #6
    public double calcHypotenuse()
    {
        double tempBase = baseLength * baseLength ;
        double tempHeight = heightLength * heightLength;
        return ( Math.sqrt( tempBase + tempHeight ) );
    }//end calcHypotenuse
    
    // #7
    public double calcAlpha()
    {
        double angle = Math.atan( heightLength /(double) baseLength );
        double convertRads = 180.0 / 3.1415;
        return( angle * convertRads );
    }//end calcAlpha
    
    // #8
    public double calcArea()
    {
        double squareArea = baseLength * heightLength;
        return( squareArea / 2 );
    }// end calcArea
    
    // #9 a
    public String toString()
    {
        if( baseLength == 0 || heightLength ==0 )
        {
            return( "The base and or height of this triangle is zero. \nThere are no stats available for this triangle." );
        }// end if
        else{
            return( "The length of the base is: " + baseLength + " meters \n" + "The length of the height is: " 
                    + heightLength + " meters \n" + "The length of the hypotenuse is: " + calcHypotenuse() + " meters \n" + 
                    "The angle alpha in degrees is: " + calcAlpha() + " degrees \n" + "The area of the triangle is: " + calcArea() + " meters squared" );
            }
    }//end toString
}//end RightTriangle class