package library.members;
public class Member {
    private String memberId;
    private String name;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Member ID : " + memberId);
        System.out.println("Name      : " + name);
    }
}

///// main java
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Book b = new Book("B101", "Database Systems");
        Member m = new Member("M505", "Aparbal");
        b.display();
        System.out.println();
        m.display();
        Transaction t = new Transaction();
        t.issueBook(b, m);
    }
}

