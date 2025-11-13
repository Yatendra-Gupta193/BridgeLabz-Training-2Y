class Base {
    public void publicMethod() {
        System.out.println("Public method: accessible everywhere.");
    }
    protected void protectedMethod() {
        System.out.println("Protected method: accessible in subclass even in another package.");
    }
    void defaultMethod() {
        System.out.println("Default method: accessible ONLY inside same package.");
    }
    private void privateMethod() {
        System.out.println("Private method: accessible ONLY inside this class.");
    }
}class Derived extends Base {
    public void checkAccess() {
        System.out.println("=== Access From Derived Class (Different Package) ===");

        publicMethod();        
        protectedMethod();    

        System.out.println("Default and Private are NOT accessible.");
    }
}
public class AccessModifierDemo {
    public static void main(String[] args) {

        Derived d = new Derived();
        d.checkAccess();

        System.out.println("\n=== Access Table ===");
        System.out.println("Public    : Accessible everywhere");
        System.out.println("Protected : Accessible in subclass across packages");
        System.out.println("Default   : Only within same package");
        System.out.println("Private   : Only within same class");
    }
}
