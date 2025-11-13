public class NestedTryExample {
  static void methodA() {
        try {
            methodB();
        }
        catch(Exception e){
            System.out.println("Handled in methodA: " + e.getMessage());
        }
    }
    static void methodB() {
        try {
            Integer.parseInt("abc"); 
        }
        catch(NumberFormatException e){
            System.out.println("Handled in methodB: " + e.getMessage());
        }
        String s = null;
        s.length();  // NullPointerException
    }
    public static void main(String[] args) {
        methodA();
    }
}
