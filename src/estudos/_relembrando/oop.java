package estudos._relembrando;

abstract class Animal {
    public abstract void makeSound();
}

interface Vehicle {
     void start();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("bark bark");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("starting machine");
    }
}

public class oop {
    public static void main(String[] args) {
        Dog dog001 = new Dog();
        Car car001 = new Car();

        dog001.makeSound();
        car001.start();
    }
}
