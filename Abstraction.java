// Abstract class
abstract class Vehicle {

    // abstract methods : a method without body declaration
    abstract void accelerate();
    abstract void brake();

    
    void startEngine() {
        System.out.println("Engine started");
    }
}

class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Abstract method : Accelerator applied");
    }
    @Override
    void brake() {
        System.out.println("Abstract method : Brake applied");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle c1 = new Car();
        c1.startEngine();
        c1.accelerate();
        c1.brake();
        Car c2 = new Car();
        c2.startEngine();
        c2.accelerate();
        c2.brake();
    }
}