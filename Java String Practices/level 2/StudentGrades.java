import java.util.*;

public class StudentGrades {
    static int[][] generateMarks(int n) {
        Random r=new Random();
        int[][] marks=new int[n][3];
        for(int i=0;i<n;i++) {
            marks[i][0]=10+r.nextInt(90);
            marks[i][1]=10+r.nextInt(90);
            marks[i][2]=10+r.nextInt(90);
        }
        return marks;
    }
    static double[][] calculateTotals(int[][] marks) {
        double[][] res=new double[marks.length][3];
        for(int i=0;i<marks.length;i++) {
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            double avg=Math.round((total/3.0)*100.0)/100.0;
            double perc=Math.round((total/300.0*100)*100.0)/100.0;
            res[i][0]=total;
            res[i][1]=avg;
            res[i][2]=perc;
        }
        return res;
    }
    static String[] calculateGrades(double[][] vals) {
        String[] grades=new String[vals.length];
        for(int i=0;i<vals.length;i++) {
            double p=vals[i][2];
            if(p>=80) grades[i]="A";
            else if(p>=70) grades[i]="B";
            else if(p>=60) grades[i]="C";
            else if(p>=50) grades[i]="D";
            else if(p>=40) grades[i]="E";
            else grades[i]="R";
        }
        return grades;
    }
    static void display(int[][] marks,double[][] vals,String[] grades) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for(int i=0;i<marks.length;i++) {
            System.out.println((i+1)+"\t"+marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t"
                    +(int)vals[i][0]+"\t"+vals[i][1]+"\t"+vals[i][2]+"\t"+grades[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][] marks=generateMarks(n);
        double[][] vals=calculateTotals(marks);
        String[] grades=calculateGrades(vals);
        display(marks,vals,grades);
    }
}
