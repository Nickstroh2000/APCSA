package com.company;

import java.util.Arrays;
//Selection sort example
public class Main
{
    public static void main( String args[] )
    {
        int[] arr = {4, 5, 2, 9, 0, 3, 1, 7, 3};
        System.out.println( "Unsorted: " + Arrays.toString( arr ));

        selectionSort( arr );

        System.out.println( "Sorted: " + Arrays.toString( arr ));
    }

    public static void selectionSort(int[] inputArray)
    {
        for ( int currentLoc = 0; currentLoc < inputArray.length-1; currentLoc++ )
        {
            /* sets the smallest to currentLoc to start with */
            int smallestLoc = currentLoc;
            /* Searching through the unsorted part of the array, looking for the smallest */
            for ( int i = currentLoc; i < inputArray.length; i++ )
            {
                if ( inputArray[i] < inputArray[smallestLoc] )
                {
                    smallestLoc = i;
                }
            }
            /* Swap the # at currentLoc with the # at the smallestLoc */
            int temp = inputArray[currentLoc];
            inputArray[currentLoc] = inputArray[smallestLoc];
            inputArray[smallestLoc] = temp;
        }

    }

}

