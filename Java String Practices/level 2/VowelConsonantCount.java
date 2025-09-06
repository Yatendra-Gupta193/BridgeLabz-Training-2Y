import java.util.Scanner;

public class VowelConsonantCount {
    static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (!isLetter(c)) return "Not";
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
        return "Consonant";
    }
    static int[] countVC(String s) {
        int v=0,c=0;
        for (int i=0;;i++) {
            try {
                char ch=s.charAt(i);
                String r=checkChar(ch);
                if(r.equals("Vowel")) v++;
                else if(r.equals("Consonant")) c++;
            } catch(Exception e){break;}
        }
        return new int[]{v,c};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int[] res=countVC(text);
        System.out.println("Vowels: "+res[0]);
        System.out.println("Consonants: "+res[1]);
    }
}
