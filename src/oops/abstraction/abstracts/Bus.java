package oops.abstraction.abstracts;

public class Bus extends Vehicle {

    @Override
    void start() {
        System.out.println("Bus Started");
    }

    @Override
    void stop() {
        System.out.println("Bus Stopped");
    }
}
