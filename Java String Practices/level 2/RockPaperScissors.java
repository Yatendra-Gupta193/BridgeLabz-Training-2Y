import java.util.*;

public class RockPaperScissors {
    static String computerChoice() {
        int c=(int)(Math.random()*3);
        if(c==0) return "rock";
        else if(c==1) return "paper";
        else return "scissors";
    }
    static String findWinner(String user, String comp) {
        if(user.equals(comp)) return "Draw";
        if(user.equals("rock") && comp.equals("scissors")) return "User";
        if(user.equals("paper") && comp.equals("rock")) return "User";
        if(user.equals("scissors") && comp.equals("paper")) return "User";
        return "Computer";
    }
    static String[][] calculateStats(String[][] results) {
        int userWins=0, compWins=0, draws=0;
        for(int i=0;i<results.length;i++) {
            if(results[i][2].equals("User")) userWins++;
            else if(results[i][2].equals("Computer")) compWins++;
            else draws++;
        }
        String[][] stats=new String[3][2];
        stats[0][0]="User Wins"; stats[0][1]=userWins+" ("+(userWins*100/results.length)+"%)";
        stats[1][0]="Computer Wins"; stats[1][1]=compWins+" ("+(compWins*100/results.length)+"%)";
        stats[2][0]="Draws"; stats[2][1]=draws+" ("+(draws*100/results.length)+"%)";
        return stats;
    }
    static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for(int i=0;i<results.length;i++) {
            System.out.println((i+1)+"\t"+results[i][0]+"\t"+results[i][1]+"\t\t"+results[i][2]);
        }
        System.out.println("\nStatistics:");
        for(int i=0;i<stats.length;i++) {
            System.out.println(stats[i][0]+": "+stats[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n=sc.nextInt();
        sc.nextLine();
        String[][] results=new String[n][3];
        for(int i=0;i<n;i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user=sc.nextLine().toLowerCase();
            String comp=computerChoice();
            String winner=findWinner(user,comp);
            results[i][0]=user;
            results[i][1]=comp;
            results[i][2]=winner;
        }
        String[][] stats=calculateStats(results);
        displayResults(results,stats);
    }
}
