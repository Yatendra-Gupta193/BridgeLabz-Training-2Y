import java.util.*;

public class VotingCheck {
    static int[] generateAges(int n) {
        Random r=new Random();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=10+r.nextInt(90);
        return arr;
    }
    static String[][] checkVoting(int[] ages) {
        String[][] res=new String[ages.length][2];
        for(int i=0;i<ages.length;i++) {
            res[i][0]=String.valueOf(ages[i]);
            if(ages[i]>=18) res[i][1]="Can Vote";
            else if(ages[i]<0) res[i][1]="Invalid";
            else res[i][1]="Cannot Vote";
        }
        return res;
    }
    static void display(String[][] arr) {
        System.out.println("Age\tStatus");
        for(int i=0;i<arr.length;i++) 
            System.out.println(arr[i][0]+"\t"+arr[i][1]);
    }
    public static void main(String[] args) {
        int[] ages=generateAges(10);
        String[][] result=checkVoting(ages);
        display(result);
    }
}
