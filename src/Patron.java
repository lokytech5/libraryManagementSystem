import java.util.ArrayList;

public class Patron {
    private String name;
    private int Id;
    private int age;
    private String phoneNumber;

    private int maxBooksBorrowed;
    private ArrayList<Book> borrowedBooks;

    public Patron(String name, int id, int age, String phoneNumber, int maxBooksBorrowed) {
        this.name = name;
        Id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.maxBooksBorrowed = maxBooksBorrowed;
        this.borrowedBooks = new ArrayList<>();
    }

    public boolean canBorrow(){
        return borrowedBooks.size() < maxBooksBorrowed;
    }

    public boolean borrowBook(Book book){
        if (!canBorrow()) {
            System.out.println(getName() + " has reached the borrowing limit and cannot borrow more books.");
            return false;
        }

        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(getName() + " has successfully borrowed " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is currently unavailable.");
        }
        return false;
    }

    public void returnedBook(Book book){
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println(getName() + " has successfully returned " + book.getTitle());
        } else {
            System.out.println(getName() + " did not borrow " + book.getTitle() + " from the library.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
