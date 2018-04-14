package com.company;

import java.util.List;
import java.util.ArrayList;

public class SeatingChart
{
    /** seats[r][c] represents the sSTudent in row r and column c in the classroom */

    private Student[][] seats;

    /** Creates a seating chart with the given number of rows & columns from the students in
     *  studentList.  Empty seats in the seating chart are represented by null.
     *  @param rows the number of rows of seats in the classroom
     *  @param cols the number of columns of seats in the classroom
     *  Precondition: rows > 0; cols > 0;
     *                rows * cols >= studentList.size()
     *  Postcondition:
     *  - Students appear in the seating chart in the same order as they appear
     *  in studentList, starting at seats[0][0].
     *  - seats is filled column by column from studentList, followed by any
     *  empty seats represented by null)
     *  - studentList is unchanged.
     */

    public SeatingChart( List<Student> studentList, int rows, int cols )
    {
        seats = new Student[rows][cols];
        int counter = 0;
        for (int c = 0; c < seats[0].length; c++){
            for (int r = 0; r < seats.length; r++){
                if(studentList.size() > counter){
                    seats[r][c] = studentList.get(counter);
                }
                counter++;
            }
        }
    }

    /** Removes students who have more than a given number of absences from the
     *  seating chart, replacing those entries in the seating chart with null
     *  and returns the number of students removed.
     *  @param allowedAbsences an integer >= 0
     *  @return number of students removed from seats
     *  Postcondition:
     *  - All students with allowedAbsences or fewer are in their original position in seats.
     *  - No student in seats has more than allowedAbsences absences.
     *  - Entries without students contain null.
     */

    public int removeAbsentStudents( int allowedAbsences )
    {
        int removedStudents = 0;
        for (int r = 0; r < seats.length; r++){
            for (int c = 0; c < seats[0].length; c++){
                if ( seats[r][c] != null && seats[r][c].getAbsenceCount() > allowedAbsences){
                    seats[r][c] = null;
                    removedStudents++;
                }
            }
        }
        return removedStudents;
    }

    /** toString method written by Q */
    public String toString()
    {
        String output = new String();
        for( int r = 0; r < seats.length; r++ )
        {
            for( int c = 0; c < seats[0].length; c++ )
            {
                output += seats[r][c] + "\t";
            }
            output += "\n";
        }
        return output;
    }
    // There may be instance variables, constructors, and methods that are not shown
}
