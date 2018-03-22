public class RandomNumbers
{
    public static void main( String[] args )
    {
        int[] randNum = new int [10];
        int sum = 0; //starting a calc
       
        for ( int index = 0; index < randNum.length; index++)
        {
            randNum[index] =  (int) (Math.random() *100);
            System.out.print( randNum[index] + ", " );
        }//end for loop
        
        for (int index =0; index < randNum.length; index++)
        {
            sum = sum + randNum[index];

        }//end for loop
        System.out.println();
        System.out.println( sum );
         for ( int index = randNum.length - 1; index >= 0; index--)
        {
            
            System.out.print( randNum[index] + ", " );

        }//end for loop
    }//end main method
}//end RandomNumbers class