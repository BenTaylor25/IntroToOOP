package StaticDynamic;

class Dog {
    static int population = 0;
    String name;
    int age;
    String breed;

    public Dog(String newName, int newAge, String newBreed) {
        name = newName;
        age = newAge;
        breed = newBreed;
        population++;
    }

    public void showInformation() {
        System.out.println(name + ", " + age + ", " + breed);
    }
}

class Maths {
    public static int addTwoNums(int a, int b) {
        return a + b;
    }

    public static int increment(int a) {
        return a + 1;
    }
}

public class DogClass {
    public static void main(String[] args) {
        System.out.println(Dog.population);
        Dog myDog = new Dog("Benji", 5, "Golden Retriever");
        Dog yourDog = new Dog("Bailey", 10, "Dachshund");

        myDog.showInformation();
        yourDog.showInformation();
        System.out.println(Dog.population);

        System.out.println(Maths.addTwoNums(3, 9));
    }
}
