package estudos.generics.test;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void makeSound() {
        System.out.println("fazendo som...");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Au au");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("MUuuu");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
       List<Dog> dogs = List.of(new Dog(), new Dog());
       List<Cow> cows = List.of(new Cow(), new Cow());
       List<Animal> animals = new ArrayList<>();

       printAnimalSound(dogs);
       printAnimalSound(cows);

       addAnimal(animals);
    }


    // nao da para adicionar nada na lista devido ao extends
    public static void printAnimalSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
//        animals.add(new Cow());
    }

    public static void addAnimal(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Cow());
    }
}
