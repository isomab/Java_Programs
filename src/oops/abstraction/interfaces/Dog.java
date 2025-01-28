package oops.abstraction.interfaces;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
