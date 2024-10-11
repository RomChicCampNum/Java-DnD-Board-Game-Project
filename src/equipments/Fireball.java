package equipments;

import characters.Character;

public class Fireball extends OffensiveGear {
    public Fireball() {
        super("Fireball", "Spell", 7, "\uD83D\uDD25");
    }


    @Override
    public String interact(Character character) {
        return "This room contains a library, you find a scroll \uD83D\uDCDC \ndescribing the spell " + getName() + " \uD83D\uDD25";
    }
}