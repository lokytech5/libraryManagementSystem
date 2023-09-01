import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating list of Books
        var book1 = new Book("JavaProgramming","programming",
                "peter Waverly", "ISB-JA10981", true);

        var book2 = new Book("Obstacle is The way","Philosophy",
                "Ryan holiday", "ISB-NOP10981", true);
        var book3 = new Book("Meditation","Philosophy",
                "Marcus Aurelius", "ISB-MED10981", true);

        //Creating list of Patrons
        var patron1 = new Patron("james",1,
                19,"+23490445092",
                7);
        var patron2 = new Patron("john",2,
                27,"+233-44055678",
                5);
        var patron3 = new Patron("danny",3,
                20,"+222-67890232",
                2);

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Patron> patrons = new ArrayList<>();

        Library library = new Library(books, patrons);
        //Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Setting available books");
        library.setAvailable(book1.isAvailable());
        library.setAvailable(book2.isAvailable());
        library.setAvailable(book3.isAvailable());

        library.removeBook(book1);

        //registering patrons to the library
        library.registerPatrons(patron1);
        library.registerPatrons(patron2);
        library.registerPatrons(patron3);

        // Displaying available books
        System.out.println("Available Books:");
        library.listAvailableBooks();
        System.out.println();

        //Displaying available patron
        library.listPatrons();
        System.out.println();

       //stimulating book borrowing
        patron1.borrowBook(book1);
        patron2.borrowBook(book2);
        patron3.borrowBook(book3);

        //stimulating returning book borrowing
        System.out.println();
        patron1.returnedBook(book1);
        patron2.returnedBook(book2);

        //Patron2 is trying to borrow book1.

        // Simulate borrowing a book by a patron
        System.out.println("Borrowing a book by James:");
        library.borrowedBook(patron1, book1);

        // Simulate returning a book by a patron
        System.out.println("Returning a book by James:");
        library.returnedBook(patron1, book1);

    }
    }