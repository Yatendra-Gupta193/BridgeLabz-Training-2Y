class Fruit {
    void show() {
        System.out.println("I am a fruit");
    }
}
class Apple extends Fruit {
    void show() {
        System.out.println("Apple");
    }
}
class Mango extends Fruit {
    void show() {
        System.out.println("Mango");
    }
}
class FruitBox<T extends Fruit> {

    java.util.List<T> list = new java.util.ArrayList<>();

    void add(T fruit) {
        list.add(fruit);
    }
    void display() {
        for (T f : list) {
            f.show();
        }
    }
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();

        // Car is not a Fruit, so it will not compile
        // box.add(new Car());
    }
}
