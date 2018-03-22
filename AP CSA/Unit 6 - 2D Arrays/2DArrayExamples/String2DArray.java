import java.util.ArrayList;

public class String2DArray
{
    public static void main( String[] args )
    {
        ArrayList<String> classRoster = new ArrayList();
        classRoster.add("Ali");
        classRoster.add("Ben");
        classRoster.add("Cat");
        classRoster.add("Don");
        classRoster.add("Evi");
        classRoster.add("Fin");
        classRoster.add("Gia");
        classRoster.add("Ham");
        classRoster.add("Ida");
        classRoster.add("Jen");
        classRoster.add("Kip");
        classRoster.add("Lou");
        classRoster.add("Mel");
        classRoster.add("Noe");
        classRoster.add("Ona");

        // 1.  Make a 2D array of Strings with 3 rows & 5 columns
        String[][] seatingChart = new String[3][5];


        
        // 2.  Fill the 2D array called seatingChart with students names' in alphabetical order with
        // (From Left to Right) Top Row: Ali - Evi, MiddleRow: Fin - Jen, Bottom Row: Kip - Ona
        //int i = 0;
        // for(int r = 0; r < seatingChart.length; r++)
        // {
            // for(int c = 0; c < seatingChart[r].length; c++)
            // {
                // seatingChart[r][c] = classRoster.get(i);
                // i++;
            // }// end forh
        // }//end for


        
        // COMMENT OUT YOUR SOLUTION TO #2
        // 3.  Fill the 2D array called seatingChart with students' names in alphabetical order with
        // (From Top to Bottom) 1st Column:Ali-Cat, 2nd:Don-Fin, 3rd:Gia-Ida, 4th:Jen-Lou, 5th:Mel-Ona

        // for(int c = 0; c < seatingChart[0].length; c++)
        // {
            // for(int r = 0; r < seatingChart.length; r++)
            // {
                // if (classRoster.size() > 0)
                // {
                    // seatingChart[r][c] = classRoster.remove(0);
                // }// end if
            // }// end for
        // }//end for
        
        
        // COMMENT OUT YOUR SOLUTIONS TO #1 & #2
        // 4.  Fill the 2D array called seatingChart with students' names in random order
        // for(int c = 0; c < seatingChart[0].length; c++)
        // {
            // for(int r = 0; r < seatingChart.length; r++)
            // {
                // if (classRoster.size() > 0)
                // {
                    // seatingChart[r][c] = classRoster.remove((int)(Math.random() * classRoster.size()));
                // }// end if
            // }// end for
        // }//end for     


        
        // COMMENT OUT YOUR SOLUTIONS TO #1, #2, & #3
        // 5.  Fill the 2D array called seatingChart with students' names in alphabetical/snake order
        // (From Top to Bottom) 1st Column:Ali-Cat, 2nd:Fin-Don, 3rd:Gia-Ida, 4th:Lou-Gen, 5th:Mel-Ona
         // for(int c = 0; c < seatingChart[0].length; c++)
        // {
            // //if the column number is even, go top to bottom
            // if (c % 2 == 0)
            // {
                // for(int r = 0; r < seatingChart.length; r++)
                // {
                    // if (classRoster.size() > 0)
                    // {
                        // seatingChart[r][c] = classRoster.remove(0);
                    // }// end if
                // }// end for
            // }  
            // //else the column number is odd, go bottom to top
            // else
            // {
                // for(int r = seatingChart.length - 1; r >= 0; r--)
                // {
                    // if (classRoster.size() > 0)
                    // {
                        // seatingChart[r][c] = classRoster.remove(0);
                    // }// end if
                // }// end for
            // }
        // }//end for             


        
        // COMMENT OUT YOUR SOLUTIONS TO #1-#4
        // 6.  Fill the 2D array called seatingChart with students' names in alphabetical/snake order
        // (From Left to Right) 1st Row:Ali-Evi, 2nd Row:Jen-Fin, 3rd:Gia-Ona
         for(int r = 0; r < seatingChart.length; r++)
        {
            //if the column number is even, go top to bottom
            if (r % 2 == 0)
            {
                for(int c = 0; c < seatingChart[0].length; c++)
                {
                    if (classRoster.size() > 0)
                    {
                        seatingChart[r][c] = classRoster.remove(0);
                    }// end if
                }// end for
            }  
            //else the column number is odd, go bottom to top
            else
            {
                for(int c = seatingChart[0].length - 1; c >= 0; c--)
                {
                    if (classRoster.size() > 0)
                    {
                        seatingChart[r][c] = classRoster.remove(0);
                    }// end if
                }// end for
            }
        }//end for                   
        


        
        // DO NOT EDIT THIS CODE
        for ( int r = 0; r < seatingChart.length; r++ )
        {
            for ( int c = 0; c < seatingChart[0].length; c++ )
            {
                System.out.print( seatingChart[r][c] + "\t" );
            }
            System.out.println();
        }
        

        
    }
}
