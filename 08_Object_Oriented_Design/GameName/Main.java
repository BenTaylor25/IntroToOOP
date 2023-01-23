package GameName;

import GameName.GameCharacters.Player;

public class Main {
    public static void main(String[] args) {
        World w = new World();
        w.addCharacter(new Player("player 1", 20));
        w.addCharacter("npc 1", 25);

        w.printAllCharacterNames();
    }
}
