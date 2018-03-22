public class UpdatedStudentDriver 
{
    public static void main( String[] args )
    {
        UpgradedStudent josieTheJunior = new UpgradedStudent( "Josie", "Johnson",
                                                                4.0, 4.0, 3.5, 4.0, 4.0);
        
        System.out.println( josieTheJunior );
        
        josieTheJunior.setGrades( 4.0, 4.0, 4.0, 4.0, 4.0 );
       System.out.println( );
       System.out.println( josieTheJunior );
    }// end main method
}// end UpdatedStudentDriver class