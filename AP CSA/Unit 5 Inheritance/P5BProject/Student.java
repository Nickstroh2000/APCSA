public abstract class Student
{
    private String name;
    private int grade;
    private String emotion;
    
    public Student()
    {
        name = "Average Dummy";
        grade = 9;
        emotion = "meh";
    }// end zero
    
    public Student( String initName, int initGrade, String initEmotion)
    {
        name = initName;
        grade = initGrade;
        emotion = initEmotion;
    }// end multi
    
    public void changeEmotion( String newEmotion )
    {
        emotion = newEmotion;
    }
    
    public String toString()
    {
        return "Hi my name is " + name + ", I'm in " + grade + "th grade and I'm " + emotion;
    }// end toString
}// end Student