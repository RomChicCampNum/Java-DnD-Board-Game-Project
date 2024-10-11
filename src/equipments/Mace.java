package equipments;

import characters.Character;

import java.util.Objects;

public class Mace extends OffensiveGear {

    public Mace() {
        super("Sledgehammer", "Mace", 3, "\uD83D\uDD28");
    }

    @Override
    public String interact(Character character) {
        if (Objects.equals(character.getType(), "Warrior")) {
            character.setOffensiveGear(this);
            return "This room contains a weapon rack, you pick a " + getName() + "\uD83D\uDD28";
        } else {
            return "This room contains a weapon rack, ou can't equip weapons, you keep moving until you reach the next room";
        }
    }
}

