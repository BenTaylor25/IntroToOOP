package ClassesAndObjects;

class Dog {
    String name;
    int age;
    String breed;

    public Dog(String newName, int newAge, String newBreed) {
        name = newName;
        age = newAge;
        breed = newBreed;
    }

    public void showInformation() {
        System.out.println(name + ", " + age + ", " + breed);
    }
}

public class DogClass {
    public static void main(String[] args) {
        Dog myDog = new Dog("Benji", 5, "Golden Retriever");
        Dog yourDog = new Dog("Bailey", 10, "Dachshund");

        myDog.showInformation();
        yourDog.showInformation();
    }
}
