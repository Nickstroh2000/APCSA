public class UpgradedStudent 
{
    private String firstName;
    private String lastName;
    private double[] grades = new double [5];
    
    
    public UpgradedStudent()
    {
        firstName = ( "Bob" );
        lastName = ( "Smith" );
        grades[0] = 0.0;
        grades[1] = 0.0;
        grades[2] = 0.0;
        grades[3] = 0.0;
        grades[4] = 0.0;
        
    }// end 0 arg method
    
    public UpgradedStudent( String initialFirstName, String initialLastName,
                            double initialEnglish, double initialMath, double initialScience,
                             double initialCTE, double initialHistory )
    {
        firstName = initialFirstName;
        lastName = initialLastName;
        grades[0] = initialEnglish;
        grades[1] = initialMath;
        grades[2] = initialScience;
        grades[3] = initialCTE;
        grades[4] = initialHistory;
    }
    
     public String toString()
    {
        return( "First name: " + firstName + "\n" + "Last name: " + lastName + "\n" +
                "GPA " + calcGPA() + "\n" + firstName + "'s average letter grade is: " + getGrade() + 
                "\n" + " - All of " + firstName + "'s grades - " + "\n" +  "English grade: " + grades[0] + "\n" +
                "Math grade: " + grades[1] + "\n" + "Science grade " + grades[2] +
                "\n" + "CTE grade " + grades[3] + "\n" + "History grade " + grades[4] + "\n");
        
    }//end toString method
    
    public void setGrades(double newEnglish, double newMath, double newScience,
                             double newCTE, double newHistory)
    {
        grades[0] = newEnglish;
        grades[1] = newMath;
        grades[2] = newScience;
        grades[3] = newCTE;
        grades[4] = newHistory;
    }// end setGrades
    
    public double calcGPA()
    {
        return ( grades[0] + grades[1] + grades[2] + grades[3] + grades[4] )/5;
    }//end calcGPA()
    
    public String getGrade()
    {
        if ( calcGPA() >= 4.0 )
        {
            return ( "A" );
        }// end if 
        else if( calcGPA() >= 3.0 && calcGPA() < 4.0 )
        {
            return ( "B" );
        }// end else if 
        else if ( calcGPA() >= 2.0 && calcGPA() < 3.0 )
        {
            return ( "C" );
        }// end else if
        else if( calcGPA() >= 1.0 && calcGPA() < 2.0 )
        {
            return ( "D" );
        }// end else if
        else
        {
            return ( "F" );
        }
     
    }// end getGrade() method
    
    public String getName()
    {
        return firstName + " " + lastName;
    }//end get name 
}//end UpgradedStudent class