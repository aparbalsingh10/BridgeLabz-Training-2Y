class Book2 {
    String title;
    String author;
    double price;
    boolean available;

    Book2(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
        System.out.println();
    }
    public static void main(String[] args) {
        Book2 b = new Book2("C++", "Stroustrup", 300, true);

        b.display();
        b.borrowBook2();
        b.display();
        b.borrowBook2();  
    }
}
