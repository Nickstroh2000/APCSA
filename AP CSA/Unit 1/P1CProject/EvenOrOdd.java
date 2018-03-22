// SELECTION (Decision Making)
// _if statements
// if_ ( relational statement )
// {
    // what you want to happen if it's true
// }//end if statement

// _if else statements_
// if ( relational statement )
// {
    // what you want to happen if it's true
// }//end if statement
// else
// {
    // what you want to happen if it's false
// }//end else statement

// RELATIONAL OPERATORS
// >, <, >=, <= 
// == (is ti equal?), != (is it NOT equal?)
    
public class EvenOrOdd
{
    public static void main( String args [] )
    {
      int  integerOne = 1;
      int  integerTwo = 0;
      int  integerThree = 36;
      int  integerFour = 45;
      int  integerFive = 0;
     
      
      
      
      
      if ( integerOne % 2  == 0 )
      {
         if ( integerOne == 0 )
          {
              System.out.println(  integerOne + " is zero" );
            }//end if
            else
            {
              System.out.println(  integerOne+ " is an even number" );
            }//end else
        }//End if
        else
        {
            System.out.println(  integerOne + " is an odd number" );
        }//end else
        
         if ( integerTwo % 2  == 0 )
      {
          if ( integerTwo == 0 )
          {
              System.out.println(  integerTwo + " is zero" );
            }//end if
            else
            {
              System.out.println(  integerTwo + " is an even number" );
            }//end else
        }//End if
        else
        {
            System.out.println(  integerTwo + " is an odd number" );
        }//end else
        
         if ( integerThree % 2  == 0 )
      {
           if ( integerThree == 0 )
          {
              System.out.println(  integerThree + " is zero" );
            }//end if
            else
            {
              System.out.println(  integerThree+ " is an even number" );
            }//end else
        }//End if
        else
        {
            System.out.println(  integerThree + " is an odd number" );
        }//end else
      
      if ( integerFour % 2  == 0 )
        {
          if ( integerFour == 0 )
          {
              System.out.println(  integerFour + " is zero" );
            }//end if
            else
            {
              System.out.println(  integerFour + " is an even number" );
            }//end else
        }//End if
        else
        {
            System.out.println(  integerFour + " is an odd number" );
        }//end else
      
         if ( integerFive % 2  == 0 )
         {
          if ( integerFive == 0 )
          {
              System.out.println( integerFive +  " is zero" );
            }//end if
            else
            {
              System.out.println(  integerFive + " is an even number" );
            }//end else
            
        }//End if
        else
        {
            System.out.println(  integerFive + " is an odd number" );
        }//end else
       
        
    }//end main method
    
   
    
}//end class EvenOrOdd