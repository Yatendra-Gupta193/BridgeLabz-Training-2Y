class InvalidStudentException extends Exception{
    public InvalidStudentException(String m){ super(m); }
}
import java.io.*;
public class OnlineExam {

    public static void main(String[] args) {
        try {
            submitExam("Krishna");
        }
        catch(InvalidStudentException e){
            System.out.println("Student error: " + e.getMessage());
        }
        catch(IOException e){
            System.out.println("IO error occurred.");
        }
        finally {
            System.out.println("Exam submission process completed.");
        }
    }
    static void validateStudent(String name) throws InvalidStudentException {
        if(!name.equals("Krishna"))
            throw new InvalidStudentException("Student not registered");
    }
    static void submitExam(String studentName) throws InvalidStudentException, IOException {

        validateStudent(studentName);
        if(studentName.length() == 0)
            throw new IOException("File error");

        System.out.println("Exam submitted successfully.");
    }
}
