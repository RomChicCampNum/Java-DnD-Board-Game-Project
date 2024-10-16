package enemies;

import board.Case;

/**
 * Classe représentant un gobelin, un type d'ennemi dans le jeu.
 * Les gobelins sont des ennemis faibles avec peu de points de vie et de force.
 */

public class Gobelin extends Enemy {

    /**
     * Constructeur de la classe Gobelin.
     * Initialise un gobelin avec des points de vie, une force d'attaque et un emoji spécifique.
     */

    public Gobelin() {
        super("Gobelin", 6, 1, "\uD83E\uDDCC");
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du gobelin.
     * Indique les points de vie et la force d'attaque spécifiques à un gobelin.
     *
     * @return une chaîne contenant les informations sur le gobelin.
     */

    @Override
    public String toString() {
        return  "\nGobelin " + this.emoji + ": " +
                "\n HP ❤\uFE0F: " + this.hp +
                "\nAttack Power ⚔\uFE0F: " + this.strength +
                "\n";
    }
}

