package enemies;

import board.Case;

public class Sorcerer extends Enemy implements Case {
    public Sorcerer() {
        super("Sorcerer", 9, 2);
    }

    @Override
    public String toString() {
        return  "\nSorcerer \uD83E\uDDDD: " +
                "\n HP ❤\uFE0F: " + this.hp +
                "\nAttack Power ⚔\uFE0F: " + this.strength +
                "\n";
    }
}