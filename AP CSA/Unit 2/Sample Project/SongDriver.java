public class SongDriver
{
    public static void main( String[] args )
    {
        //make a new song with the zero-arg constructor
        Song mySong1 = new Song();
        
        //make a new song with multi-arg constructor
        Song mySong2 = new Song( "Let It be", 320, 0.99 );
        Song mySong3 = new Song( "Monster Mash", 200, 0.50 );
       
        //print out mySong1 & mySong2
        System.out.println( mySong1 ); // prints everything for song 1
        System.out.println( mySong2.getTitle() ); // I just want thetitle
        System.out.println( "Is mySong3 a favorite song? " );
        System.out.println( mySong3.getIsFavorite() ); // prints if its a favorite
        System.out.println( "Make mySong3 a favorite " );
        mySong3.makeFavorite(); // makes it a favorite
        System.out.println( "Is mySong3 a favorite? " + mySong3.getIsFavorite() ); // checks if its a fav
    }// end main method
}// end class SongDriver