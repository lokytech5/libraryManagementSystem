import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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

        //registering patrons to the library
        library.registerPatrons(patron1);
        library.registerPatrons(patron2);
        library.registerPatrons(patron3);

        System.out.println("Welcome to the Library Management System!");

        while(true) {
            System.out.println("Main Menu:");
            System.out.println("1. List all available books");
            System.out.println("2. List registered patrons"); // Added option to list patrons
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.println();

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    // Displaying available books
                    System.out.println();
                    library.listAvailableBooks();
                    System.out.println();
                    break;
                case 2:
                    //Displaying available patron
                    System.out.println();
                    library.listPatrons();
                    System.out.println();
                    break;
                case 3:
                    //stimulating book borrowing
                    System.out.println("Borrowing books:");
                    patron1.borrowBook(book1);
                    patron2.borrowBook(book2);
                    patron3.borrowBook(book3);
                    break;
                case 4:
                    //stimulating returning book borrowing
                    System.out.println("Returning Books");
                    patron1.returnedBook(book1);
                    patron2.returnedBook(book2);
                    break;
                case 5:
                    System.out.println("Exiting the Library Management System.");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

//        // Simulate borrowing a book by a patron
//        System.out.println("Borrowing a book by James:");
//        library.borrowedBook(patron1, book1);
//
//        // Simulate returning a book by a patron
//        System.out.println("Returning a book by James:");
//        library.returnedBook(patron1, book1);

    }
    }