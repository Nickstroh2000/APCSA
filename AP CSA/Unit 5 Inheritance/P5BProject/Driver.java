import java.util.ArrayList;
public class Driver
{
    public static void main( String[] args )
    {
        ArrayList<Student> studentList= new ArrayList();
        
        studentList.add( new Freshman ( "Billy", 9,  true ) );
        studentList.add( new Junior( "Nick", 11, true) );
        studentList.add( new Senior( "Jack", 12, false) );
        
        for( Student item: studentList )
        {
            System.out.println("-------------NEXT STUDENT------------ \n");
            System.out.println( item );
        }// end for
    }// end main
}// end class