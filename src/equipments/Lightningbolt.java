package equipments;

import characters.Character;

import java.util.Objects;

public class Lightningbolt extends OffensiveGear {
    public Lightningbolt() {
        super("Lightning bolt", "Spell", 1, "⚡");
    }


    @Override
    public String interact(Character character) {
        if (Objects.equals(character.getType(), "Magician")) {
            character.setOffensiveGear(this);
            System.out.println("This room contains a library, you find a scroll \uD83D\uDCDC \ndescribing the spell " + getName()  + " " + getEmoji());
            return "equipGear";
        } else {
            System.out.println("This room contains a library, ou can't use spell scrolls, you keep moving until you reach the next room");
            return "dontEquipGear";
        }
    }
}