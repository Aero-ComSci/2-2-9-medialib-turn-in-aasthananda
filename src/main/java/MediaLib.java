/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
    private Book book;
    private Movie movie;
    private Song song;
    private String lastModified;

    public static String owner = "PLTW";

    private static int numEntries;
    private static int numBooks;
    private static int numMovies;
    private static int numSongs;

    public MediaLib()
    {
        lastModified = LastModified.getDateTime();
    }

    public static void changeOwner(String newOwner) {
        owner = newOwner;
    }

    public void addBook(Book b)
    {
        if (book == null)
        {
            book = b;
            numEntries++;
            numBooks++;
            lastModified = LastModified.getDateTime();
        }
        else
        {
            System.out.println("Cannot add a new book: A book already exists");
        }
    }

    public void addMovie(Movie m)
    {
        if (movie == null)
        {
            movie = m;
            numEntries++;
            numMovies++;
            lastModified = LastModified.getDateTime();
        }
        else
        {
            System.out.println("Cannot add a new movie: A movie already exists");
        }
    }

    public void addSong(Song s)
    {
        if (song == null)
        {
            song = s;
            numEntries++;
            numSongs++;
            lastModified = LastModified.getDateTime();
        }
        else
        {
            System.out.println("Cannot add a new song: A song already exists");
        }
    }

    public Book getBook()
    {
        return book;
    }

    public static String getOwner()
    {
        return owner;
    }

    public static int getNumEntries()
    {
        return numEntries;
    }

    public static int getNumBooks()
    {
        return numBooks;
    }

    public static int getNumMovies()
    {
        return numMovies;
    }

    public static int getNumSongs()
    {
        return numSongs;
    }

    public String toString()
    {
        String info = "";
        if (book != null)
            info += "Book: " + book + "\n";
        if (movie != null)
            info += "Movie: " + movie + "\n";
        if (song != null)
            info += "Song: " + song + "\n";
        info += "Last Modified: " + lastModified + "\n";
        return info;
    }

    //public void testBook(Book tester){
    //tester.setTitle("Title change");
    //System.out.println(tester);}
}
