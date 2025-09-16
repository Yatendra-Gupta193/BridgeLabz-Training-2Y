class LibraryManagementSystem {
    static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public void displayDetails() {
        System.out.println("ISBN: " + isbn + ", Title: " + title + ", Author: " + author);
    }
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
    public static void main(String[] args) {
        Book b1 = new Book("101", "Java Basics", "James Gosling");
        Book b2 = new Book("102", "Python Guide", "Guido van Rossum");

        if (b1 instanceof Book) b1.displayDetails();
        if (b2 instanceof Book) b2.displayDetails();

        Book.displayLibraryName();
    }
}
