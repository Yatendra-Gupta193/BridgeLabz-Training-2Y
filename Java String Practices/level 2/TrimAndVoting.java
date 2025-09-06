import java.util.*;

public class TrimAndVoting {
    static int[] trimIndices(String s) {
        int start = 0, end = 0;
        try { for(;s.charAt(start)==' ';start++); } catch(Exception e){}
        try { for(end=start; s.charAt(end)!='\0'; end++); } catch(Exception e){}
        end--;
        try { for(;s.charAt(end)==' ';end--); } catch(Exception e){}
        return new int[]{start,end+1};
    }
    static String substring(String s, int start, int end) {
        String res="";
        for(int i=start;i<end;i++) res+=s.charAt(i);
        return res;
    }
    static boolean compare(String a, String b) {
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
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
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] idx=trimIndices(s);
        String trimmed=substring(s,idx[0],idx[1]);
        System.out.println("User Defined Trim: "+trimmed);
        System.out.println("Built-in Trim: "+s.trim());
        System.out.println("Equal: "+compare(trimmed,s.trim()));

        int[] ages=generateAges(10);
        String[][] result=checkVoting(ages);
        display(result);
    }
}
