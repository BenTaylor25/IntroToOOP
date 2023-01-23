package Interfaces;

interface ICanWalk {
    public void walk();   // abstract because it's in an interface
}

interface ITest {}

abstract class Animal {
    String name;
    int age;

    public Animal(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public void birthday() {
        age++;
    }

    public abstract void speak();
}

class Dog extends Animal implements ICanWalk, ITest {
    public Dog(String newName, int newAge) {
        super(newName, newAge);
    }

    @Override
    public void walk() {
        System.out.println("dog is walking");
    }

    @Override
    public void speak() {
        System.out.println(name + ": Woof!");
    }
}

class Cat extends Animal {
    public Cat(String newName, int newAge) {
        super(newName, newAge);
    }

    @Override
    public void speak() {
        System.out.println(name + ": Meow!");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Animal[] pets = {
            new Dog("Benji", 5),
            new Cat("Kat", 7),
        };

        for (Animal pet : pets) {
            pet.speak();

            if (pet instanceof ICanWalk) {
                ICanWalk walkingPet = (ICanWalk) pet;
                walkingPet.walk();
            }
        }
    }
}
