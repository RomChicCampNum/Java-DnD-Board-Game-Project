package equipments;

import characters.Character;

public class Shield extends DefensiveGear {
    public Shield() {
        super("Wooden Shield", "Shield", 1, " \uD83D\uDEE1\uFE0F");
    }

    @Override
    public String interact(Character character) {
        return getName() + "\uD83D\uDEE1\uFE0F";
    }
}
