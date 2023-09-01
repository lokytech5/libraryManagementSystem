import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookArrayList = new ArrayList<>();
    ArrayList<Patron> patronArrayList = new ArrayList<>();
    private boolean isAvailable;

    public Library(ArrayList<Book> books, ArrayList<Patron> patrons) {
        bookArrayList.addAll(books);
        patronArrayList.addAll(patrons);
    }

    public void listAvailableBooks() {
        System.out.println("List of available books:");
        for (Book book : bookArrayList) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
            }
        }
    }
    public void listPatrons() {
        System.out.println("Patrons Members:");
        for (Patron patron : patronArrayList) {
            System.out.println(patron.getName());
        }
    }

    public void addBook(Book book){
        bookArrayList.add(book);
    }

    public void removeBook(Book book){
        bookArrayList.remove(book);
    }

    public void registerPatrons(Patron patron){
        patronArrayList.add(patron);
    }

    public void borrowedBook(Patron patron, Book book){
        if (!isAvailable) {
            System.out.println("The library is currently closed.");
            return;
        }

        if (!patronArrayList.contains(patron)) {
            System.out.println("Invalid patron. Please register as a library member.");
            return;
        }

        if (!patron.canBorrow()) {
            System.out.println(patron.getName() + " has reached the borrowing limit.");
            return;
        }

        if (!bookArrayList.contains(book)) {
            System.out.println("The library does not have the book you requested.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Sorry, " + book.getTitle() + " is currently unavailable.");
            return;
        }

        patron.borrowBook(book);
        book.setAvailable(false);
        System.out.println(patron.getName() + " has successfully borrowed " + book.getTitle());

    }

    public void returnedBook(Patron patron, Book book){
        if (!isAvailable) {
            System.out.println("The library is currently closed.");
            return;
        }

        if (!patronArrayList.contains(patron)) {
            System.out.println("Invalid patron. Please register as a library member.");
            return;
        }

        if (!bookArrayList.contains(book)) {
            System.out.println("The library does not have the book you are trying to return.");
            return;
        }
//Check here in case of error
        if (patron.borrowBook(book)) {
            patron.returnedBook(book);
            book.setAvailable(true);
            System.out.println(patron.getName() + " has successfully returned " + book.getTitle());
        } else {
            System.out.println(patron.getName() + " did not borrow " + book.getTitle() + " from this library.");
        }
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
