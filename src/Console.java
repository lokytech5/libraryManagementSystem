import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println("Welcome to the Library Management System!");
        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. List all available books");
//            System.out.println("2. Search for a book");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");

//            int choice = readInt("Enter your choice: ");

//            switch (choice) {
//                case 1:
//                    // List all available books logic
//                    library.listAvailableBooks();
//                    break;
//                case 2:
//                    // Borrow a book logic
//                    String bookToBorrow = readString("Enter the title or ISBN of the book you want to borrow: ", scanner);
//                    // Search for the book in the library's catalog
//                    Book foundBook = null;
//                    for (Book book : library.bookArrayList) {
//                        if (book.getTitle().equalsIgnoreCase(bookToBorrow) || book.getISBN().equalsIgnoreCase(bookToBorrow)) {
//                            foundBook = book;
//                            break; // Stop searching once a matching book is found
//                        }
//                    }
//
//                    if (foundBook != null) {
//                        if (foundBook.isAvailable()) {
//                            // Check if the user is a registered patron (you might need to prompt for patron info)
//                            // For now, let's assume the user is a registered patron
////                            Patron patron = /* Get the patron object */;
//                            Patron patron = patron1;
//
//                            if (patron != null) {
//                                // Check if the patron can borrow more books (implement in Patron class)
//                                if (patron.canBorrow()) {
//                                    // Perform the borrowing process
//                                    library.borrowedBook(patron, foundBook);
//                                } else {
//                                    System.out.println(patron.getName() + " has reached the borrowing limit.");
//                                }
//                            } else {
//                                System.out.println("Invalid patron. Please register as a library member.");
//                            }
//                        } else {
//                            System.out.println("Sorry, " + foundBook.getTitle() + " is currently unavailable.");
//                        }
//                    } else {
//                        System.out.println("The library does not have the book you requested.");
//                    }
//                    break;
//                case 3:
//                    String bookToReturn = readString("Enter the title or ISBN of the book you want to return: ", scanner);
//
//                    // Search for the book in the library's catalog
//                    Book foundBook1 = null;
//                    for (Book book : library.bookArrayList) {
//                        if (book.getTitle().equalsIgnoreCase(bookToReturn) || book.getISBN().equalsIgnoreCase(bookToReturn)) {
//                            foundBook1 = book;
//                            break; // Stop searching once a matching book is found
//                        }
//                    }
//
//                    if (foundBook1 != null) {
//                        // Check if the user is a registered patron (you might need to prompt for patron info)
//                        // For now, let's assume the user is a registered patron
//                        Patron patron = patron2 /* Get the patron object */;
//
//                        if (patron != null) {
//                            // Check if the patron has borrowed the book
//                            if (patron.borrowBook(foundBook1)) {
//                                // Perform the return process
//                                library.returnedBook(patron, foundBook1);
//                            } else {
//                                System.out.println(patron.getName() + " did not borrow " + foundBook1.getTitle() + " from this library.");
//                            }
//                        } else {
//                            System.out.println("Invalid patron. Please register as a library member.");
//                        }
//                    } else {
//                        System.out.println("The library does not have the book you are trying to return.");
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("Exiting the Library Management System.");
//                    return; // Exit the program
//                default:
//                    System.out.println("Invalid choice. Please select a valid option.");
//            }
//        }
//    }

//    public static int readInt(String prompt) {
//        System.out.print(prompt);
//        return scanner.nextInt();
//    }
//
//    public static String readString(String prompt) {
//        System.out.print(prompt);
//        return scanner.next();
//    }
        }
    }
}

