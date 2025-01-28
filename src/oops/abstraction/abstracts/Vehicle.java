package oops.abstraction.abstracts;

public abstract class Vehicle {

    String colour;

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }

    void idle() {
        System.out.println("Vehicle is in idle state");
    }
}


//Abstraction is nothing but hiding internal implementation only exposing important info to the user
//Abstaction can be achieved by abstract class and interface
//Abstact classes can have abstract methods(without body) and concrete methods(with body).
//Abstract class cannot be instantiated but subclasses can be.so to initialize fields available in abstract
//class which are common to all subclasses
