public class Student
{
    // 1. private instance variables
    private String firstName;
    private String lastName;
    private int IDNum;
    private boolean hasASB; 
    private int grade;
    
    // 2.constructors
    // zero arg
    public Student()
    {
        firstName = ( "Bob" );
        lastName = ( "Smith" );
        IDNum = 0;
        hasASB = false;
        grade = 9;
    }//end zero arg constructor
    
    //multi arg
    public Student( String initialFirstName, String initialLastName,
    int initialIDNum, int intitialGrade )
    {
        firstName = initialFirstName;
        lastName = initialLastName;
        IDNum = initialIDNum;
        grade = intitialGrade;
        
    }//end multi arg constructor
    
    // 3. toString()
    public String toString()
    {
       return( "First Name: " + firstName + "\n" +  "Last Name: " + lastName + 
       "\n" + "ID Number: " + IDNum + "\n" + "Grade Number: " + grade + "\n" +
       "Has ASB card?: " + hasASB + "\n" );
    }// end toString method
    
    // get methods
    public String getFirstName()
    {
        return firstName;
    }// end getFirstName
    
    public String getLastName()
    {
        return lastName;
    }// end getLastName
    
    public int getIDNum()
    {
        return IDNum;
    }// end getIDNum
    
    public boolean getHasASB()
    {
        return hasASB;
    }// end getHasASB
    
    public int getGrade()
    {
        return grade;
    }//end getGrade
    
    public void setFirstName( String newFirstName )
    {
        firstName = newFirstName;
    }// end setFirstName
    
    public void setLastName( String newLastName )
    {
        lastName= newLastName;
    }// end setLastName
    
    public void setIDNum( int newIDNum )
    {
        IDNum = newIDNum;
    }//end setIDNum
    // setter method
    public void setASB( boolean initialASB )
    {
        hasASB = initialASB;
    }
    
    public void SetGrade( int newGrade )
    {
        grade = newGrade;
    }// end setGrade
}//end class Student