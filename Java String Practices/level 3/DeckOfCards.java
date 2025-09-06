import java.util.Scanner;

public class DeckOfCards {

    static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }
    static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }
        String[][] distributed = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }
    static void printPlayersCards(String[][] distributed) {
        if (distributed == null) return;
        for (int i = 0; i < distributed.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < distributed[i].length; j++) {
                System.out.println("  " + distributed[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        String[][] distributed = distributeCards(deck, players, cardsPerPlayer);
        printPlayersCards(distributed);

        sc.close();
    }
}
