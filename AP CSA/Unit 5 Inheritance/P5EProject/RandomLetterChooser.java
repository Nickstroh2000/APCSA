public class RandomLetterChooser extends RandomStringChooser
{
    // constructor to be written in part B
    
    public RandomLetterChooser( String stringArray )
    {
        super(getSingleLetters(stringArray));
    }// end single arg
    
    public static String[] getSingleLetters( String str )
    {
        int wordLength = str.length();
        String[] outputArray = new String[wordLength];
        for ( int i = 0; i < wordLength; i++)
        {
            outputArray[i] = str.substring(i,i+1);
        }
        return outputArray;
    }
}
