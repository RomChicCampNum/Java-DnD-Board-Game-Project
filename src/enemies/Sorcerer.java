package enemies;

import board.Case;

public class Sorcerer extends Enemy implements Case {
    public Sorcerer() {
        super("Sorcerer", 9, 2, " \uD83E\uDDDD");
    }

    @Override
    public String toString() {
        return  "\nSorcerer " + this.emoji +": " +
                "\n HP ❤\uFE0F: " + this.hp +
                "\nAttack Power ⚔\uFE0F: " + this.strength +
                "\n";
    }
}