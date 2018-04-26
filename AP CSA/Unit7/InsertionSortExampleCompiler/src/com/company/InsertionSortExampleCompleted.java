package com.company;
import java.util.Arrays;


public class InsertionSortExampleCompleted
{
    public static void main( String args[] )
    {
        int[] arr = {4, 5, 2, 9, 0, 3, 1, 7, 3};
        System.out.println( "Unsorted: " + Arrays.toString( arr ));

        insertionSort( arr );

        System.out.println( "Sorted: " + Arrays.toString( arr ));
    }

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            /* This loop is looking at every value
             * Sets currentNum to the value at j
             * Makes a new iterator which is one less that j
             */
            int currentNum = array[j];
            int i = j-1;

            /* While loop is comparing the currentNum to the sorted section*/
            while ( (i > -1) && ( array[i] > currentNum ) ) {
                array[i+1] = array[i];
                i--;
            }

            /* Placing the the current number in its correct spot */
            array[i+1] = currentNum;
        }

    }

}
