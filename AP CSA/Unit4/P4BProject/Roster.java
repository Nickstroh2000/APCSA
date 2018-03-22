public class Roster
{
    private UpgradedStudent[] studentList;
    
    public Roster()
    {
        studentList = new UpgradedStudent[3];
        studentList[0] = new UpgradedStudent();
        studentList[1] = new UpgradedStudent( "John", "Doe", 4, 3, 2, 1, 0 );
        studentList[2] = new UpgradedStudent( "Ned", "Stark", 3, 2, 4, 1,  );
    }// end zero arg
    
    public String findStudentWithMaxGPA()
    {
        int indexHighest = 0;
        for( int i = 0; i < studentList.length-1; i++ )
        {
            if( studentList[i].calcGPA() > studentList[i+1].calcGPA() )
            {
               // GPAHighest = studentList[i].calcGPA();
                indexHighest = i;
            }// end if
            else
            {
                indexHighest = i+1;
            }
        }//end for
        return "Student with the highest GPA is: " + studentList[indexHighest].getName() + "\n";
    }// end findStudentWithMaxGPA()
    
    public String toString()
    {
        String allTheStudents = new String();
        
        for( UpgradedStudent item: studentList )
        {
            allTheStudents = allTheStudents + item;
        }// end forEach
        return( allTheStudents + findStudentWithMaxGPA() );
    }// end toString
}// end Roster class