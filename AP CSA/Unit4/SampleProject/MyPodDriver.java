public class MyPodDriver
{
    public static void main( String[] args )
    {
        MyPod carPod = new MyPod();
        MyPod workoutPod = new MyPod( "Red", 256 );
        
        System.out.println( carPod );
        System.out.println( workoutPod );
    }// end main
}// end MyPodDriver class