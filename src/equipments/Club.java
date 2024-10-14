package equipments;

import characters.Character;

import java.util.Objects;

public class Club extends OffensiveGear {

    public Club() {
        super("Club", "Mace", 1, "\uD83D\uDD28");
    }



    @Override
    public String interact(Character character) {
        if (Objects.equals(character.getType(), "Warrior")) {
            character.setOffensiveGear(this);
            System.out.println("This room contains a weapon rack, you pick a " + getName()  + " " + getEmoji() +
                    "\n Your Attack Power is now " + character.getStrength() + getLevel());
            return "equipGear";
        } else {
            System.out.println("This room contains a weapon rack, ou can't equip weapons, you keep moving until you reach the next room");
            return "dontEquipGear";
        }
    }
}

