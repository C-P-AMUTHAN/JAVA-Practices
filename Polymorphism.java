// polymorphism has two types
// 1. Method overloading
// 2. Method overriding

class Function {
    void bestWishes() {
        System.out.println("All the best");
    }
    void bestWishes(String name) {
        System.out.println(name+" , all the best");
    }
    void eat(String fType) {
        System.out.println("Parent class: "+fType);
    }
}

class Food extends Function {
    @Override
    void eat(String name) {
        System.out.println("Child class: "+name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Food f = new Food();

        // Method overriding
        f.eat("Non veg");

        // Method overloading
        f.bestWishes();
        f.bestWishes("C p AMuthan");

        // overriding method from its parent class
        Function F = new Function();
        F.eat("veg");
    }
}