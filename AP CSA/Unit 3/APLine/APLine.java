public class APLine 
{
    private int a;
    private int b;
    private int c;
    
    /** constructs an APLine object (ax+by+c=0) with 3 different userdefined variables
     * @param initialA integer coefficient of the x
     * @param initialB integer coefficient of the y
     * @param initialC integer constant
     * 
     */
    public APLine( int initialA, int initialB, int initialC )
    {
        a = initialA;
        b = initialB;
        c = initialC;
        
    }// end APLIne class
    
    /** formats the output of an APLine to be ax + by + c = 0
     * @param none
     * @return equation
     */
    public String toString()
    {
        return ( a + "x" + "+" + " " + b + "y" + "+" + " " + "+" + c + "= 0" ); 
    }//end toString
    
    /** divides -a by b to produce the slope of the line
     * @param none
     * @return slope as a double number 
     */
    public double getSlope()
    {
        return((double) -a/b );
    }//end getSlope
    
    /** plugs in x and y coordinate of an ordered pair and checks if its a solution
     * @param x integer x-coordinate of an ordered pair
     * @param y integer y-coordinate of an ordered pair
     * @return true or false
     */
    public boolean isOnLine( int x, int y )
    {
        if( ( a * x ) + ( b * y ) + c == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }//end else
    }//end isOnLine
}//end class APLine