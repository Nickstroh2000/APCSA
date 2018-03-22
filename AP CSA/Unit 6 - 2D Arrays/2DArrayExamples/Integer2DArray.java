// Making a 2D Array tracking the amount of the TV
// Jeff watches daily for 4 weeks

public class Integer2DArray 
{
    public static void main(String[] args)
    {
        int[][] watchHrs = new int[4][7]; // 4 rows, 7 columns
        
        // EXAMPLE 1: Assigning individual values
        watchHrs[0][0] = 3; // week 1 sunday
        watchHrs[0][1] = 7; // week 1 Monday
        watchHrs[0][2] = 0; // week 1 Tuesday
        watchHrs[0][3] = 15; // week 1 Wed
        watchHrs[0][4] = 5; // week 1 Thurs
        watchHrs[0][5] = 1; // week 1 Fri
        watchHrs[0][6] = 2; // week 1 Sat
        
        System.out.println( "EXAMPLE 1: Printing out one row" );
        for(int c = 0; c < watchHrs[0].length; c++)
        {
            System.out.print(watchHrs[0][c] + "\t");
        }// end for
        System.out.println();
        
        // EXAMPLE 2: Using a loop to assign a whole row with  random numbers
       // for(int c = 0; c < watchHrs[0].length; c++)
       // {
        //    watchHrs[0][c] = (int)(Math.random() * 10);
        //}// end for
        System.out.println( "EXAMPLE 2: Printing out one row with random numbers" );
        for(int c = 0; c < watchHrs[0].length; c++)
        {
            System.out.print(watchHrs[0][c] + "\t");
        }// end for
        System.out.println();
       
        // row-major taversal
        //EXAMPLE 3: Printing entire chart
        
        for(int r = 0; r < watchHrs.length; r++)
        {
            for(int c = 0; c < watchHrs[0].length; c++)
            {
                watchHrs[r][c] = (int)(Math.random() * 10);
            }// end for
        }//end for
        // row-major taversal
        System.out.println("EXAMPLE 3:Printing entire chart");
        for(int r = 0; r < watchHrs.length; r++)
        {
            for(int c = 0; c < watchHrs[0].length; c++)
            {
                System.out.print(watchHrs[r][c] + "\t");
            }// end for
            System.out.println();
        }//end for
        
        //EXAMPLE 4: Finding the sum of a row: week 1
        int week1Sum = 0;
        for (int c = 0; c < watchHrs[0].length; c++)
        {
            week1Sum += watchHrs[0][c];
            
        }// end for
        System.out.println("Sum of week 1: " + week1Sum);
        // EXAMPLE 4: Find the average of Week 3
        double week3Ave = 0.0;
        double week3Sum = 0;
        for(int c = 0; c < watchHrs[2].length; c++)
        {
            week3Sum += watchHrs[2][c];
        }// end for
        week3Ave = week3Sum / watchHrs[2].length;
        System.out.println("Average of week 3: " + week3Ave);
        
        // EXAMPLE 5: Finding the sum of a column: Wednesday
        int wedSum = 0;
        for (int r = 0; r < watchHrs.length; r++)
        {
            wedSum += watchHrs[r][3];
        }// end for
        System.out.println("Sum of Wednesday Hours: " + wedSum);
        
        // EXAMPLE 5: Find the average of Saturday
        double satAve = 0.0;
        double satSum = 0;
        for (int r = 0; r < watchHrs.length; r++)
        {
            satSum += watchHrs[r][6];
        }// end for 
        satAve = satSum / watchHrs.length;
        System.out.println("Average of saturday " + satAve);
    }// end main
}//end class