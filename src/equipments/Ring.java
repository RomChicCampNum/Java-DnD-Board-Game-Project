package equipments;

import characters.Character;

public class Ring extends DefensiveGear {
    public Ring() {
        super("Protection Ring", "Ring", 1, " \uD83D\uDC8D");
    }

    @Override
    public String interact(Character character) {
        return getName() + "\uD83D\uDC8D";
    }
}
