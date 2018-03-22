public class Student
{
    private String firstName;
    private String lastName;
    private int grade;
    
    public Student()
    {
        firstName = new String( "John" );
        lastName = new String( "Doe" );
        grade = 9;
    } // end zero-arg constructor
    
    public Student( String initFirst, String initLast, int initGrade )
    {
        firstName = initFirst;
        lastName = initLast;
        grade = initGrade;
    }
    
    /* incrementYear adds one year to a Student object's grade
     */
    public void incrementYear()
    {
        grade++;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public int getGrade()
    {
        return grade;
    }
    
    public String toString()
    {
        return ( "Name: " + firstName + " " + lastName + "\t\t" +
                 "Grade: " + grade + "\n" );
    }
    
} // end class Student