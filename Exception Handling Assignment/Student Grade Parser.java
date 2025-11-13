public class StudentGradeParser {

    public static void main(String[] args) {

        String[] grades = {"90", "A+", "85", "B", "100"};
        for (String g : grades) {
            try {
                int grade = Integer.parseInt(g);
                System.out.println("Valid grade: " + grade);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + g);
            }
        }
    }
}
