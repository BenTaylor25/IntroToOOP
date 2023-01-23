package GameName.GameCharacters;

public abstract class GameCharacter {
    private String name;
    private int age;

    public GameCharacter(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
    }
}
