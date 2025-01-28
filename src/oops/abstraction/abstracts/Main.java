package oops.abstraction.abstracts;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bus = new Bus();
        bus.start();
        bus.stop();
        bus.idle();
    }
}
