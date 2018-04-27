package com.company;

import java.util.Arrays;

public class Main

{
    public static void main( String[] args )
    {
        int[] arr = {(int)(Math.random() * 50),(int)(Math.random() * 50),(int)(Math.random() * 50),(int)(Math.random() * 50),(int)(Math.random() * 50),(int)(Math.random() * 50),(int)(Math.random() * 50),(int)(Math.random() * 50),(int)(Math.random() * 50),(int)(Math.random() * 50),(int)(Math.random() * 50),};
        System.out.println( Arrays.toString(arr) );

        mergeSort(arr);

        System.out.println( Arrays.toString(arr) );
    }

    /** Sorts an array using merge sort.
     *  @param a the array to sort
     */
    public static void mergeSort( int[] a )
    {
        //BASE CASE: if the array is length 1, it's already sorted
        if ( a.length <=1 )
        {
            return;
        }

        // DIVIDE into two halves
        int[] front = new int[ a.length / 2 ];
        int[] back = new int[ a.length - front.length ];
        for (int i = 0; i < front.length; i++ )
        {
            front[i] = a[i];
        }
        for ( int j = 0; j < back.length; j++ )
        {
            back[j] = a[front.length + j];
        }
        // RECURSIVE CALLS calling mergeSort on each half
        mergeSort( front );
        mergeSort( back );
        merge( front, back, a );
    }

    /** Merges two sorted arrays into an array
     *  @param first the first sorted array
     *  @param second the second sorted array
     *  @param a the array into which to merge the first and the second
     */
    private static void merge( int[] first, int[] second, int[] a )
    {
        int currLoc1 = 0; // the video calls this a pointer (next element to consider in first)
        int currLoc2 = 0; // the video calls this a pointer (next element to consider in second)
        int currLocA = 0; // next open position in a

        // As long as currLocFirst and currLocSecond do not pass the end,
        // copy the smaller element into int[] a
        while ( currLoc1 < first.length && currLoc2 < second.length )
        {
            if ( first[currLoc1 ] < second[currLoc2] )
            {
                a[currLocA] = first[currLoc1];
                currLoc1++;
            }
            else
            {
                a[currLocA] = second[currLoc1];
                currLoc2++;

            }
            currLocA++;
            /* Did you remember to increment currLocA? */
        }

        // While there are still elements in first, copy over the remaining entries
        while ( currLoc1 < first.length )
        {
            a[currLocA] = first[currLoc1];
            currLoc1++;
            currLocA++;
        }
        // While there are still elements in second, copy over the remaining entries
        while ( currLoc2 < second.length )
        {
            a[currLocA] = second[currLoc2];
            currLoc2++;
            currLocA++;
        }
    }
}
