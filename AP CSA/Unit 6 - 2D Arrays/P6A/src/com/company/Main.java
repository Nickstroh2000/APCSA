package com.company;

public class Main {

    public static void main(String[] args) {
	int[][] numChart = new int[4][6];

	for (int r = 0; r < numChart.length; r++)
    {
       for( int c = 0; c < numChart[0].length; c++)
       {
           numChart[r][c] = (int) (Math.random() * 10);
       }
    }
    System.out.println("2D Array Example");

    for( int r = 0; r < numChart.length; ++r ){
	    for(int c = 0; c < numChart[0].length; c++) {
	        System.out.print(numChart[r][c] + "\t");
	    }

	    System.out.println();
	}
	System.out.println("\n" + "Locations of fives:");
    int counter = 0;
    for (int r = 0; r < numChart.length; r++)
    {
        for( int c = 0; c < numChart[0].length; c++)
        {
            if(numChart[r][c] == 5)
            {
                counter++;
                System.out.println("Row: " + r + "\t" + "Column: " + c);
            }
        }
    }
    System.out.println("\n" + "Number of fives: " + counter);
    }
}
