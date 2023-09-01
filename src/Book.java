public class Book {
    private String title;
    private String genre;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String genre, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book Title: " + getTitle() + "\n" +
                "Genre: " + getGenre() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "ISBN: " + getISBN() + "\n" +
                "Availability: " + (isAvailable() ? "Available" : "Not Available");
    }
}
