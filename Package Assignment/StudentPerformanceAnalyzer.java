class Student {
    String name;
    int m1, m2, m3;
    public Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    @Override
    public String toString() {
        return "Name: " + name +
               "\nMarks: " + m1 + ", " + m2 + ", " + m3;
    }
}
class Analyzer {

    public double calculateAverage(Student s) {
        return (s.m1 + s.m2 + s.m3) / 3.0;
    }
    public String findGrade(double avg) {

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else return "D";
    }
}
public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {

        Student s = new Student("Krishna", 85, 92, 78);

        Analyzer a = new Analyzer();

        double avg = a.calculateAverage(s);
        String grade = a.findGrade(avg);

        System.out.println("=== Student Performance Report ===");
        System.out.println(s);
        System.out.println("Average: " + avg);
        System.out.println("Grade  : " + grade);
    }
}
