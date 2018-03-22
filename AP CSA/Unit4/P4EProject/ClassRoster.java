import java.util.ArrayList;

public class ClassRoster
{
    /* ClassRoster should use an ArrayList called enrolledStudents       
     *(instead of an array to store Student objects.
     */
    private ArrayList<Student> enrolledStudents;
    // zero-arg constructor goes here
    
    public ClassRoster()
    {
        enrolledStudents = new ArrayList<Student>();
    }// end zero arg
    
    /* addStudent will add a given Student to the ArrayList
     * enrolledStudents to the end of the ArrayList.
     * @param newStudent object
     */
    public void addStudent ( Student newStudent )
    {
         enrolledStudents.add ( newStudent );
    }// end addStudent
    
    /* dropStudent will drop a student with the given last
     * name from the enrolledStudent array list
     * @param lastName in the form of a String
     */
    public void dropStudent( String lastName )
    {
        for( int i = 0; i < enrolledStudents.size(); i++)
        {
            if( enrolledStudents.get(i).getLastName().equals( lastName ) )
            {
                enrolledStudents.remove(i);
                i--;
            }// end if
        } // end for
    } // end dropStudent
    
    /* newYear will advance every student to the next grade &
     * deletes any student who has graduated past Grade 12.
     */
     public void newYear()
    {
        for( int i = 0; i < enrolledStudents.size(); i++ )
        {
            enrolledStudents.get(i).incrementYear();
            if( enrolledStudents.get(i).getGrade() > 12 )
            {
                dropStudent( enrolledStudents.get(i).getLastName() );
                i--;
            }// end if 
        }// end for
    }
    
    /* toString will print out each student on a new line
     * Do not use the ArrayList class's default printing.
     * @return String
    */
    public String toString( )
    {
       String studentList = new String();
       for( Student student : enrolledStudents )
       {
           studentList = studentList + student;
       }
       return( "Roster: \n" + studentList );
    }// end toString
} // end class ClassRoster
     

