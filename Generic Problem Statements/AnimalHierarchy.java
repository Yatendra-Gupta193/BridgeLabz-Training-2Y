import java.util.*;
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat");
    }
}
class AnimalHierarchy {
    static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.sound();
        }
    }
    public static void main(String[] args) {
        List<Dog> dogList = Arrays.asList(new Dog(), new Dog());
        List<Cat> catList = Arrays.asList(new Cat(), new Cat());

        printAnimals(dogList);
        printAnimals(catList);
    }
}
