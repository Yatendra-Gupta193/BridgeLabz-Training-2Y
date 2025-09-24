import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private String borrowerName;
    private boolean isReserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public void reserveItem(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isReserved = true;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private String borrowerName;
    private boolean isReserved;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isReserved = true;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
}

class DVD extends LibraryItem implements Reservable {
    private String borrowerName;
    private boolean isReserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isReserved = true;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
}

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        
        items.add(new Book("B001", "Java Programming", "James Gosling"));
        items.add(new Magazine("M001", "Tech Weekly", "Tech Publications"));
        items.add(new DVD("D001", "Learning Java", "Code Academy"));
        items.add(new Book("B002", "Advanced Java", "John Smith"));
        
        for (LibraryItem item : items) {
            item.getItemDetails();
            
            if (item instanceof Reservable) {
                boolean available = ((Reservable) item).checkAvailability();
                System.out.println("Available: " + available);
                if (available) {
                    ((Reservable) item).reserveItem("Library User");
                    System.out.println("Item reserved successfully");
                }
            }
            
            System.out.println("-------------------");
        }
    }
}
