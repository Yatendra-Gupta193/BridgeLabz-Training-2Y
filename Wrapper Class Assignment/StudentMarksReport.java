import java.util.ArrayList;
public class StudentMarksReport {
    public static void main(String[] args) {

        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc", 72};

        ArrayList<Integer> marks = new ArrayList<>();

        for (Object obj : inputs) {
            try {
                if (obj == null) continue;

                if (obj instanceof Integer) {
                    marks.add((Integer) obj);
                }
                else {
                    String s = obj.toString();
                    if (s.equals("null")) continue;
                    marks.add(Integer.parseInt(s));  
                }
            }
            catch (Exception e) {
            }
        }
        int sum = 0;
        for (int m : marks) sum += m;
        double avg = (double) sum / marks.size();
        System.out.println("Valid marks: " + marks);
        System.out.println("Average = " + avg);
    }
}
