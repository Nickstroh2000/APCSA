package com.company;

public class Student
{
    /** Private instance variables created by Q */
    private String name;
    private int absenceCount;

    /** Two-arg constructor written by Q */
    public Student(String initName, int initAbsenceCount)
    {
        name = initName;
        absenceCount = initAbsenceCount;
    }

    /** Returns the name of this Student */
    public String getName()
    {  return name;  }

    /** Returns the number of times this Student has missed class */
    public int getAbsenceCount()
    {  return absenceCount;  }

    /** toString method written by Q */
    public String toString()
    {  return name + " " + absenceCount;  }
}

