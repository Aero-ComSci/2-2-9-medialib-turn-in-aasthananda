/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
    public static void main(String[] args)
    {
        // System.out.println("Welcome to your Media Library");

        // MediaLib myLib = new MediaLib();
        // Book myBook = new Book("Lord of the Rings", "Tolkien");
        // System.out.println("Book created " + myBook);
        // myLib.addBook(myBook);
        // //myBook.setTitle("Harry Potter and the Philosopher's Stone");
        // //System.out.println(myBook.getTitle());
        // //myBook.setAuthor("J.K. Rowling");
        // //System.out.println(myBook.getAuthor());
        // System.out.println("Library:\n" + myLib);

        // int myRating = 5;
        // myBook.adjustRating(myRating);
        // System.out.println(myBook);

        // Book currBook = myLib.getBook();
        // currBook.setTitle("My Favorite Book");
        // System.out.println("Current book: " + currBook);
        // System.out.println(myLib);

        // System.out.println("You have a NEW Library");
        // MediaLib myLib2 = new MediaLib();
        // Book newBook = new Book("To Kill a Mockingbird", "Lee");
        // myLib2.addBook(newBook);
        // System.out.println(myLib2);

        // newBook = new Book("1984", "Orwell");
        // System.out.println(myLib2);
        // //System.out.println("before test:" + newBook);
        // //myLib.testBook(newBook);
        // //System.out.println("after test:" + newBook);

        // Book newBook2 = new Book("1984", "Orwell");
        // System.out.println("Are newBook and newBook2 equal? " + newBook.equals(newBook2));

        // newBook2.setTitle("Animal Farm");
        // System.out.println("After changing title, are they equal? " + newBook.equals(newBook2));

        // //System.out.println(newBook2.title);

        // Movie myMovie = new Movie("Inception", 2.5);
        // myMovie.adjustRating(9);
        // myLib.addMovie(myMovie);
        // System.out.println("Library with movie:\n" + myLib);

        // New code added based on instructions:
        MediaLib myLib = new MediaLib();
        myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
        myLib.addBook(new Book("1984", "Orwell"));
        myLib.addSong(new Song("In Your Eyes"));
        System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);
    }
}
