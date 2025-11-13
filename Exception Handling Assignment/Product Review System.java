class InvalidRatingException extends Exception {
    public InvalidRatingException(String m){ super(m); }
}
class EmptyReviewException extends Exception {
    public EmptyReviewException(String m){ super(m); }
}
public class ProductReview {

    public static void main(String[] args) {

        try {
            submitReview(6, "Nice product!");  
        }
        catch(InvalidRatingException e){
            System.out.println("Rating error: " + e.getMessage());
        }
        catch(EmptyReviewException e){
            System.out.println("Review error: " + e.getMessage());
        }
    }
    static void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {

        if(rating < 1 || rating > 5)
            throw new InvalidRatingException("Rating must be 1 to 5");

        if(comment == null || comment.trim().isEmpty())
            throw new EmptyReviewException("Comment cannot be empty");

        System.out.println("Review submitted!");
    }
}
