package oops.abstraction.interfaces;

public interface Animal {

    //All fields are public static final so constructor is not needed
    public static final String place = "land";


    //all methods are by default public abstact
    public abstract void makeSound();

    //default method is added after java 8+
    default void sleep() {
        System.out.println("animal is sleeping");
    }

    //static method is added after java 8+
    static void info() {
        System.out.println("Animal have different sounds");
    }
}


/*
An interface in Java is a blueprint for a class, which specifies a set of methods that the class must implement.
        It is a powerful tool for achieving abstraction in Object-Oriented Programming (OOP),
        as it allows developers to define what a class should do, while leaving the how it does it up to the implementing class.*/

    /*Key Features of Interfaces
       100% Abstraction (Pre-Java 8)
        Interfaces can have only abstract methods (before Java 8), meaning all methods in an interface must be implemented by the implementing class.

        Method Declarations:
        Methods in an interface are public and abstract by default (no need to specify these modifiers explicitly).

        Fields:
        Fields in interfaces are public, static, and final by default.
        Interfaces cannot have instance variables.
        Java 8 Enhancements:
        Interfaces can now have:

        Default methods (methods with a body using default keyword).
        Static methods (methods that can be invoked without an instance).
        Multiple Inheritance:
        A class can implement multiple interfaces, overcoming the limitation of single inheritance in abstract classes.

        No Constructors:
        Interfaces cannot have constructors because they cannot be instantiated.*/