package oops.abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();
        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();

        //Calling static method of interface
        Animal.info();
    }
}
