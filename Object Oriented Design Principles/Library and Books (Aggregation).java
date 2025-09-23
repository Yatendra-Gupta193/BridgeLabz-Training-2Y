import java.util.ArrayList;
class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }   
    public String getAuthor() {
        return author;
    } 
    @Override
    public String toString() {
        return "Book: " + title + " by " + author;
    }
}
class Library {
    private String name;
    private ArrayList<Book> books;  
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
        System.out.println("Books in " + name + " library:");
        for (Book book : books) {
            System.out.println("  - " + book);
        }
    }
}
public class AggregationExample {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Data Structures", "Jane Smith");
        Book book3 = new Book("Algorithms", "Bob Johnson");
        
        Library centralLibrary = new Library("Central Library");
        Library cityLibrary = new Library("City Library");
      
        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);
        
        cityLibrary.addBook(book2);  
        cityLibrary.addBook(book3);
      
        centralLibrary.displayBooks();
        System.out.println();
        cityLibrary.displayBooks();
      
        System.out.println("\nIndependent book: " + book1.getTitle());
    }
}
