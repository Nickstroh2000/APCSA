public class MySecondApp
{
    static int defaultInt;
    static double defaultDouble;
    static boolean defaultBoolean;
    static String defaultString;
    
   public static void main( String args[] )
   {
     int myFavoriteInt = 5;
     double myFavoriteDouble = 1.5;
     boolean myFavoriteFood = true;
     String myFavoriteBand = new String ("Queen");
     
      System.out.println( "The default int is " + defaultInt);
      System.out.println( "The default double is " + defaultDouble);
      System.out.println( "The default boolean is " + defaultBoolean);
      System.out.println( "The default string is " + defaultString);
     
     System.out.println( "my favorite int is " + myFavoriteInt);
     System.out.println( "my favorite double is " + myFavoriteDouble);
     System.out.println( "is my favorite food Italian? " + myFavoriteFood);
     System.out.println( "my favorite band is " + myFavoriteBand);  
       
    }//end main method
    
   
}// end MySecondApp