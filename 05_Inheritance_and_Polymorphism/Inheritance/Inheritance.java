package Inheritance;

class Animal {
    String name;
    int age;

    public Animal(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public void birthday() {
        age++;
    }
}

class Dog extends Animal {
    public Dog(String newName, int newAge) {
        super(newName, newAge);
    }

    public void woof() {
        System.out.println(name + ": Woof!");
    }
}

class Cat extends Animal {
    public Cat(String newName, int newAge) {
        super(newName, newAge);
    }

    public void meow() {
        System.out.println(name + ": Meow!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal[] pets = {
            new Animal("test", 0),
            new Dog("Benji", 5),
            new Dog("Bailey", 10),
            new Cat("Kat", 7),
        };

        for (Animal pet : pets) {
            System.out.println(pet.name);

            if (pet instanceof Dog) {
                Dog dog = (Dog) pet;
                dog.woof();
            } else if (pet instanceof Cat) {
                Cat cat = (Cat) pet;
                cat.meow();
            }
        }
    }
}
