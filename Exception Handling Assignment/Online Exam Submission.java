import java.time.*;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String m){ super(m); }
}
class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String m){ super(m); }
}
public class ExamSubmit {
    static LocalDateTime deadline = LocalDateTime.of(2025, 1, 20, 23, 59);

    public static void main(String[] args) {

        String file = "answer.docx";
        LocalDateTime time = LocalDateTime.now();

        try {
            submitExam(file, time);
            System.out.println("Submitted successfully");
        }
        catch(Exception e){
            System.out.println("Submission failed: " + e.getMessage());
        }
    }
    static void submitExam(String fileName, LocalDateTime submitTime)
            throws LateSubmissionException, InvalidFileFormatException {

        if(!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("invalid file format");

        if(submitTime.isAfter(deadline))
            throw new LateSubmissionException("late submission");

    }
}
