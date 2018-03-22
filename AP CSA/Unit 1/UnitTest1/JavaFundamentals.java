import javax.swing.JOptionPane;
public class JavaFundamentals
{
    public static void main( String[] args )
    {
        //number 1
        String input = JOptionPane.showInputDialog( "Whats the numberr of satellites" );
        int numSatellites = Integer.parseInt(input);
        //number 2
        int[] satellites = new int [numSatellites];
        //number 4
        int[] satelliteAltitude = new int [numSatellites];
        //number 6
        String[] orbitLocation = new String [numSatellites];
        //number 3
        for(int index = 0; index < numSatellites; index++ )
        {
           satellites[index] = index + 1;
        }//end for
        
        //number 5
        for(int index = 0; index < numSatellites; index++)
        {
            satelliteAltitude[index] =  (int) (Math.random() *(195001) + 5000);
        }//end for
        
        //number 7
        for(int index = 0; index < numSatellites; index++)
        {
            if ( satelliteAltitude[index] < 10000 )
            {
                orbitLocation[index] = new String ("Not good");
            }//end if
            
             if ( satelliteAltitude[index] < 50000 && satelliteAltitude[index] >=10000 )
            {
                orbitLocation[index] = new String ("Low earth orbit");
            }//end if
            
             if ( satelliteAltitude[index] < 150000 && satelliteAltitude[index] >= 50000 )
            { 
                orbitLocation[index] = new String ("High earth orbit");
            }//end if
            
             if ( satelliteAltitude[index] >= 150000 )
            {
                orbitLocation[index] = new String ("You're out of orbit");
            }//end if
        }//end for
        
        //number 8
        System.out.print( "Satellite\t");
        System.out.print( "Satelite Altitude\t" );
        System.out.println( "Orbit Location" );
       
        //number 9 
        for(int index = 0; index < numSatellites; index++)
        {
           System.out.println( satellites[index] + "\t\t" + satelliteAltitude[index]
           + "\t\t\t" + orbitLocation[index] );
        
        }
        
    }//end main method
}//end class JavaFundamentals