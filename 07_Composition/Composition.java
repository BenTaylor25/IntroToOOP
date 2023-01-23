
interface IWeapon {
    public void attack();
}

class Sword implements IWeapon {
    public Sword() {}

    @Override
    public void attack() {
        System.out.println("Attacks with a sword");
    }
}

class Axe implements IWeapon {
    public Axe() {}

    @Override
    public void attack() {
        System.out.println("Attacks with a axe");
    }
}

class Person {
    String name;

    public Person(String newName) {
        name = newName;
    }
}

class Player extends Person {
    IWeapon weapon;

    public Player(String newName, IWeapon newWeapon) {
        super(newName);
        weapon = newWeapon;
    }
}

public class Composition {
    public static void main(String[] args) {
        Player myPlayer = new Player("Player 1", new Axe());

        System.out.println("Name: " + myPlayer.name);
        myPlayer.weapon.attack();
    }
}
