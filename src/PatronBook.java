public interface PatronBook {
    boolean borrowBook(Book book);

    void returnedBook(Book book);
}
