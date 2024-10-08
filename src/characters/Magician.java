package characters;

import equipments.Spell;
import equipments.Potion;

public class Magician extends Character {
    public Magician(String name, String type) {
        super(name, type);
        this.setHp(6);
        this.setStrength(15);
        this.setOffensiveGear(new Spell());
        this.setDefensiveGear(new Potion());
    }
}
