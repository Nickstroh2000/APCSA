package com.company;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 9, 2, 0, 2, 4, 5};

        int index1 = linearSearch(arr, 2);
        System.out.println(index1);

        int index2 = linearSearch(arr, 7);
        System.out.println(index2);
    }

    /**
     * This method takes an array called array and a
     * key to search for, and returns the index of
     * key if it is in the array or -1 if it is not
     * found.
     */
    public static int linearSearch(int[] array, int key) {
        for (int index = 0; index < array.length; index++){
            if (index == key){
                return index;
            }
        }
        return -1;
    }
}
