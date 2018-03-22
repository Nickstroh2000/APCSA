class RandomIntegers {
    
    public static void main( String[] args )
    {
        int[] randNums = new int [10]; 
        int counter = 0;
        for( int index = 0; index < randNums.length; index++)
        {
            randNums[index]  = (int)( ( Math.random()*200)-100 ); 
            System.out.println( randNums[index] );
        }//end for loop
            System.out.println();
        for ( int index = 0; index < randNums.length; index++)
        {
           System.out.println(randNums[index] + 10); 
            }//end for loop
            System.out.println();
        for (int index = 0; index < randNums.length; index++)
        {
            
            if (randNums[index] > 0)
            {
                counter++;
                
                }//end if 
                
            }//end for loop
            System.out.println( counter );
    }//end main method
    
}//end Class RandomIntegers