package enemies;

import board.Case;
import characters.Character;

public abstract class Enemy implements Case {

    private String type;
    protected int hp;
    protected int strength;

    // Constructeur
    public Enemy(String type, int hp, int strength) {
        this.type = type;
        this.hp = hp;
        this.strength = strength;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String interact(Character character) {
        return "Behind the door of this room, an enemy is waiting you ! Prepare to fight the " + getType() + "!";
    }

    public String toString() {
        return "\nEnemy \uD83D\uDC79: " + this.type +
                "\n HP ❤\uFE0F: " + this.hp +
                "\nAttack Power ⚔\uFE0F: " + this.strength +
                "\n";


    }


}
