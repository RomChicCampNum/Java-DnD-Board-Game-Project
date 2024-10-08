package characters;

import equipments.Weapon;
import equipments.Shield;

public class Warrior extends Character {
    public Warrior (String name, String type) {
        super(name, type);
        this.setHp(10);
        this.setStrength(10);
        this.setOffensiveGear(new Weapon());
        this.setDefensiveGear(new Shield());
    }

    /*public Warrior (String name, String type, Weapon weapon, Shield shield) {
        super(name, type);
        this.setHp(6);
        this.setStrength(15);
        this.setOffensiveGear(weapon);
        this.setDefensiveGear(shield);
    }*/
}
