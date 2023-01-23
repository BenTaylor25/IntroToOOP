package AbstractClasses;

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

class Dog extends Animal {
    public Dog(String newName, int newAge) {
        super(newName, newAge);
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

public class AbstractClasses {
    public static void main(String[] args) {
        Animal[] pets = {
            new Dog("Benji", 5),
            new Cat("Kat", 7),
        };

        for (Animal pet : pets) {
            pet.speak();
        }
    }
}
