package enemies;

import board.Case;

public class Drake extends Enemy implements Case {
    public Drake() {
        super("Drake", 15, 4, "\uD83D\uDC32");
    }

    @Override
    public String toString() {
        return "\nDrake " + this.emoji + ": " +
                "\n HP ❤\uFE0F: " + this.hp +
                "\nAttack Power ⚔\uFE0F: " + this.strength +
                "\n";
    }
}
