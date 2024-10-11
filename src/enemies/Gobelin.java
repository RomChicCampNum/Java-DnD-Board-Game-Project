package enemies;

import board.Case;

public class Gobelin extends Enemy {
    public Gobelin() {
        super("Gobelin", 6, 1);
    }

    @Override
    public String toString() {
        return  "\nGobelin \uD83E\uDDCC: " +
                "\n HP ❤\uFE0F: " + this.hp +
                "\nAttack Power ⚔\uFE0F: " + this.strength +
                "\n";
    }
}
