import java.util.ArrayList;
public class RandomStringChooser
{
    ArrayList<String> wordsList = new ArrayList();
    public RandomStringChooser(String[] words)
    {
        for( String item : words )
        {
            wordsList.add(item);
        }// end for each
    }
    
    public String getNext()
    {
        if( wordsList.size() > 0 )
        {
            return wordsList.remove((int)(Math.random()* wordsList.size()));
        }// end if
        return "NONE";
    }// end getnext
}// end class

