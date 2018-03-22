public class QuadraticFormula 
{
   public static void main ( String args [] )
   {
       //MATH OPERATORS: +, -, *, /, =
       //Math.sqrt( radicand )
       
       int a = 1;
       int b = 3;
       int c = 4;
       int discriminant = b*b -4*a*c;
      
       System.out.println( "a = " + a );
       System.out.println( "b = " + b );
       System.out.println( "c = " + c );
       System.out.println( "b^2 = " + b*b );
       System.out.println( "4ac = " + 4*a*c );
       System.out.println("discriminant = " + discriminant );
       
       if(discriminant < 0 ) 
       {
           System.out.println( "Sorry the discriminant is negative ");
        }//end if
        else
        {
            System.out.println( (-b + Math.sqrt ( discriminant  )) /2*a );
            System.out.println( (-b - Math.sqrt ( discriminant )) /2*a  );
        }//end else
        
    
    
    }// end main method
    
}//end class QuadraticFormula