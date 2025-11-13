class BookNotAvailableException extends Exception { public BookNotAvailableException(String m){super(m);} }
class InvalidReturnException extends Exception { public InvalidReturnException(String m){super(m);} }
class UserLimitExceededException extends Exception { public UserLimitExceededException(String m){super(m);} }

class Library {
    String[] borrowed = new String[10];
    int count = 0;

    void borrow(String book) throws BookNotAvailableException, UserLimitExceededException {
        if (count >= 5)
            throw new UserLimitExceededException("You can't borrow more than 5 books.");

        for (int i = 0; i < count; i++) {
            if (borrowed[i].equals(book))
                throw new BookNotAvailableException("Book already borrowed.");
        }
        borrowed[count++] = book;
        System.out.println("Borrowed: " + book);
    }
    void returnBook(String book) throws InvalidReturnException {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (borrowed[i].equals(book)) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    borrowed[j] = borrowed[j + 1];
                }
                count--;
                System.out.println("Returned: " + book);
                break;
            }
        }
        if (!found)
            throw new InvalidReturnException("This book was not borrowed.");
    }
}
public class LibraryMiniNoSet {
    public static void main(String[] args) {
        Library lib = new Library();

        try {
            lib.borrow("Java");
            lib.borrow("Java"); // will throw
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
