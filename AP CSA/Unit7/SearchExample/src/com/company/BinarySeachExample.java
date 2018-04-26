package com.company;

public class BinarySeachExample {

        public static void main( String[] args )
        {
            int[] arr = {4, 5, 16, 22, 27, 31, 40, 48, 49};

            int index1 = binarySearch(arr, 48);
            System.out.println(index1);

            int index2 = binarySearch(arr, 10);
            System.out.println(index2);
        }

        /**
         * This method takes an array called array and a
         * key to search for, and returns the index of
         * key if it is in the array or -1 if it is not
         * found.
         */
        public static int binarySearch(int[] array, int key)
        {
            int low = 0;
            int high = array.length - 1;
            int mid = (low + high) / 2;
            while (low < high){
                if (array[mid] == key){
                    return mid;
                }
                else if (array[mid] > key){
                    high = mid - 1;
                    mid = (low + high)/2;
                }
                else if (array[mid] < key){
                    low = mid + 1;
                    mid = (low + high)/2;
                }
            }
            return -1;
        }
    }

