public class ShoppingCartTotal {
    public static void main(String[] args) {

        String[] prices = {"250", "499", "99", "abc", "100"};
        int total = 0;

        for (String p : prices) {
            try {
                int price = Integer.parseInt(p); // wrapper method
                total += price;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid price skipped: " + p);
            }
        }
        System.out.println("Total price = " + total);
    }
}
