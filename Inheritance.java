class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void barks() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        // its own method
        d.barks();
        // inherited method from super class
        d.eat();
        d.sleep();
    }
}
