package equipments;

import characters.Character;

public class Lightningbolt extends OffensiveGear {
    public Lightningbolt () {
        super("Frostbolt", "Spell", 1, " ⚡");
    }


    @Override
    public String interact(Character character) {
        return "This room contains a library, you find a scroll \uD83D\uDCDC \ndescribing the spell " + getName() + " ⚡";
    }
}