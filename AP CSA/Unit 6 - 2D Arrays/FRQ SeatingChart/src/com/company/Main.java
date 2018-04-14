package com.company;

import java.util.ArrayList;

public class Main
{
    public static void main( String[] args )
    {
        ArrayList<Student> classRoster = new ArrayList();
        classRoster.add( new Student( "Karen", 3 ) );
        classRoster.add( new Student( "Liz", 1 ) );
        classRoster.add( new Student( "Paul", 4 ) );
        classRoster.add( new Student( "Les", 1 ) );
        classRoster.add( new Student( "Henry", 5 ) );
        classRoster.add( new Student( "Renee", 9 ) );
        classRoster.add( new Student( "Glen", 2 ) );
        classRoster.add( new Student( "Fran", 6 ) );
        classRoster.add( new Student( "David", 1 ) );
        classRoster.add( new Student( "Danny", 3 ) );

        SeatingChart introCS = new SeatingChart( classRoster, 3, 4 );
        System.out.println( "Seating Chart on 4/10" );
        System.out.println( introCS );
        System.out.println( "Seating Chart after Absence Sweep" );
        introCS.removeAbsentStudents(4);
        System.out.println( introCS );
    }
}

