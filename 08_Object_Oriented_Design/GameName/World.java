package GameName;

import java.util.ArrayList;

import GameName.GameCharacters.GameCharacter;
import GameName.GameCharacters.NPC;

public class World {
    private ArrayList<GameCharacter> characters;

    public World() {
        characters = new ArrayList<>();
    }

    public void addCharacter(String name, int age) {
        characters.add(new NPC(name, age));
    }

    public void addCharacter(GameCharacter c) {
        characters.add(c);
    }

    public void printAllCharacterNames() {
        for (GameCharacter c : characters) {
            System.out.println(c.getName());
        }
    }
}
