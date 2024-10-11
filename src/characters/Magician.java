package characters;

import equipments.Lightningbolt;
import equipments.Fireball;
import equipments.Frostbolt;
import equipments.Ring;


public class Magician extends Character {
    public Magician(String name, String type) {
        super(name, type);
        this.setHp(6);
        this.setStrength(15);
        this.setOffensiveGear(new Lightningbolt());
        this.setDefensiveGear(new Ring());
    }
}
