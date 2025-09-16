class UniversityManagementSystem  {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }
    public static void main(String[] args) {
        PostgraduateStudent pgs = new PostgraduateStudent(101, "Ravi", 8.5);
        pgs.displayDetails();
        pgs.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pgs.getCGPA());
    }
}
