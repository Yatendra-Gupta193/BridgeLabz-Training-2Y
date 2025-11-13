class Book {
    String title;
    String author;

    public Book(String t, String a) {
        this.title = t;
        this.author = a;
    }
    public void showBook() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}
class Member {
    String name;
    int memberId;

    public Member(String n, int id) {
        this.name = n;
        this.memberId = id;
    }
    public void showMember() {
        System.out.println("Member: " + name + " | ID: " + memberId);
    }
}
class Transaction {
    public void issueBook(Book b, Member m) {
        System.out.println("Issued \"" + b.title + "\" to " + m.name);
    }
}
public class LibraryManagementDemo {
    public static void main(String[] args) {

        System.out.println("=== Adding New Book ===");
        Book b = new Book("Java Basics", "James Gosling");
        b.showBook();

        System.out.println("\n=== Registering New Member ===");
        Member m = new Member("Krishna", 101);
        m.showMember();

        System.out.println("\n=== Issuing Book ===");
        Transaction t = new Transaction();
        t.issueBook(b, m);
    }
}
