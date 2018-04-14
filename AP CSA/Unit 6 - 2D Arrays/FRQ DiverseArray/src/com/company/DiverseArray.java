package com.company;

public class DiverseArray
{
    /** Part (a): Complete method arraySum below
     */

    /** returns the sum of the entries in the one-dimensional array arr
     */

    public static int arraySum( int[] arr )
    {
        int counter = 0;
        for (int i = 0; i < arr.length; i++)
        {
            counter += arr[i];

        }
        return counter;
    }

    /** Part (b): Assume that arraySum works as specified regardless of what you wrote in part (a).
     * You must use arraySum appropriately to receive full credit.
     * Complete method rowSums below.
     */

    /** returns a one-dimensional array in which the entry at index k is the sum of
     * the entries of row k of the two dimensional array 2D
     */

    public static int[] rowSums( int[][] arr2D )
    {
        int[] sum = new int[arr2D.length];
        for (int r = 0; r < arr2D.length; r++) {
            for (int c = 0; c < arr2D[0].length; c++) {
                sum[r] = arraySum(arr2D[r]);
            }
        }
        return sum;
    }

    /** Part (c): Assume that arraySum and rowSums work as specified, regardless of what you wrote in parts (a) and (b).
     * You must use rowSums appropriately to receive credit.
     * Complete method isDiverse below.
     */

    /** returns true if all rows in arr2D have different row sums; false otherwise
     */

    public static boolean isDiverse( int[][] arr2D )
    {
        int[] sums = rowSums(arr2D);
        for (int index = 0; index < sums.length-1; index++){
            for (int i = index+1; i < sums.length; i++) {
                if (sums[index] == sums[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
