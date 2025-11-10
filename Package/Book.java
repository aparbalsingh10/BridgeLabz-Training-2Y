package library.books;
public class Book {
    private String bookId;
    private String title;

    public Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Book Title: " + title);
    }
}
