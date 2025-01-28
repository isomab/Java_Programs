package oops.abstraction.abstracts;

public class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}
