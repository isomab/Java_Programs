package oops.polymorphism.runtimepolymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}


//Runtime polymorphism occurs when a method in a superclass is overridden in a subclass.
// The method to be executed is determined at runtime based on the object type for example dog and cat.