public class AgeValidator {

    public static boolean checkAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkAge("20")); // true
        System.out.println(checkAge("abc")); // false
        System.out.println(checkAge("15")); // false
    }
}
