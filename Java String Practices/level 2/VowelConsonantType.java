import java.util.Scanner;

public class VowelConsonantType {
    static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (!((c >= 'a' && c <= 'z'))) return "Not a Letter";
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
        return "Consonant";
    }
    static String[][] findTypes(String s) {
        int len=0;
        try { for(;;len++) s.charAt(len); } catch(Exception e){}
        String[][] arr=new String[len][2];
        for(int i=0;i<len;i++){
            arr[i][0]=String.valueOf(s.charAt(i));
            arr[i][1]=checkChar(s.charAt(i));
        }
        return arr;
    }
    static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+"\t"+arr[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[][] result=findTypes(text);
        displayTable(result);
    }
}
