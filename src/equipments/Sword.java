package equipments;

import characters.Character;

import java.util.Objects;

public class Sword extends OffensiveGear {

    public Sword() {
        super("Sword", "Sword", 3, " \uD83D\uDDE1\uFE0F ");
    }


    @Override
    public String interact(Character character) {
        if (Objects.equals(character.getType(), "Warrior")) {
            character.setOffensiveGear(this);
            return "This room contains a weapon rack, you pick a " + getName() + " \uD83D\uDDE1\uFE0F ";
        } else {
            return "This room contains a weapon rack, ou can't equip weapons, you keep moving until you reach the next room";
        }
    }
}