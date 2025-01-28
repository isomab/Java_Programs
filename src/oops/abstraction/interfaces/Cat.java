package oops.abstraction.interfaces;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
