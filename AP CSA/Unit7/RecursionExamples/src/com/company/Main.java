package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("FACTORIAL EXAMPLE");
        System.out.println("1! = " + factorial(1));
        System.out.println("2! = " + factorial(2));
        System.out.println("3! = " + factorial(3));
        System.out.println("4! = " + factorial(4));
        System.out.println("5! = " + factorial(5));
        System.out.println("6! = " + factorial(6));
        System.out.println("7! = " + factorial(7));
        System.out.println("8! = " + factorial(8));
        System.out.println("9! = " + factorial(9));
        System.out.println("10! = " + factorial(10));
        System.out.println("11! = " + factorial(11));
        System.out.println("12! = " + factorial(12));
        System.out.println("13! = " + factorial(13));
        System.out.println("14! = " + factorial(14));
        System.out.println("15! = " + factorial(15));
        System.out.println("16! = " + factorial(16));
        System.out.println("17! = " + factorial(17));
        System.out.println("18! = " + factorial(18));
        System.out.println("19! = " + factorial(19));
        System.out.println("20! = " + factorial(20) + "\n");

        System.out.println( "SELECTION SORT EXAMPLE" );
        System.out.println( "I am doing a selection sort of 10 items." );
        System.out.println( "This will require " + numComparisons(10) + " comparisons.");

        System.out.println( "I am doing a selection sort of 20 items." );
        System.out.println( "This will require " + numComparisons(20) + " comparisons.");

        System.out.println( "I am doing a selection sort of 1000 items." );
        System.out.println( "This will require " + numComparisons(1000) + " comparisons.");
    }

    /**
     * Returns the factorial of n
     * Factorial = n*(n-1)*(n-2)*(n-3)*....*1
     * Precondition: n >= 0
     */

    public static long factorial(int n) {
        //BASE CASE
        if (n == 0) {
            return 1;
        }
        //RECURSIVE CASE
        else {
            return n * factorial(n - 1);
        }
    }


/** Returns the number of comparisons in a Selection Sort for n items
 *  Precondition: n >= 2;
 */
    public static int numComparisons( int n )
    {
        //BASE CASE
        if (n == 2){
            return 1;
        }
        //RECURSIVE CASE
        else{
            return (n - 1) + numComparisons(n - 1);
        }
    }
   }
