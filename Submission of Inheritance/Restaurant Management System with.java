class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performance();
}

class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performance() {
        System.out.println("Chef " + name + " is cooking " + specialty + " dishes with excellence.");
    }
}

class Waiter extends Person implements Worker {
    private int tablesServed;

    public Waiter(String name, int id, int tablesServed) {
        super(name, id);
        this.tablesServed = tablesServed;
    }

    public void performance() {
        System.out.println("Waiter " + name + " has served " + tablesServed + " tables efficiently.");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101, "Italian");
        Waiter waiter = new Waiter("Alice", 102, 15);

        chef.performance();
        waiter.performance();
    }
}
