package equipments;

import characters.Character;

import java.util.Objects;

public class Frostbolt extends OffensiveGear {
    public Frostbolt() {
        super("Frostbolt", "Spell", 1, "❄\uFE0F");
    }

    @Override
    public String interact(Character character) {
        if (Objects.equals(character.getType(), "Magician")) {
            character.setOffensiveGear(this);
            return "This room contains a library, you find a scroll \uD83D\uDCDC \n describing the spell " + getName() + " ❄\uFE0F";
        } else {
            return "This room contains a weapon rack, ou can't equip weapons, you keep moving until you reach the next room";
        }
    }
}