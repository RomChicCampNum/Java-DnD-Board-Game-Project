package enemies;

import board.Case;

/**
 * Classe représentant un drake, un puissant type d'ennemi dans le jeu.
 * Les drakes ont beaucoup de points de vie et une force d'attaque élevée.
 */

public class Drake extends Enemy implements Case {

    /**
     * Constructeur de la classe Drake.
     * Initialise un drake avec des points de vie, une force d'attaque et un emoji spécifique.
     */

    public Drake() {
        super("Drake", 15, 4, "\uD83D\uDC32");
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du drake.
     * Indique les points de vie et la force d'attaque spécifiques à un drake.
     *
     * @return une chaîne contenant les informations sur le drake.
     */

    @Override
    public String toString() {
        return "\nDrake " + this.emoji + ": " +
                "\n HP ❤\uFE0F: " + this.hp +
                "\nAttack Power ⚔\uFE0F: " + this.strength +
                "\n";
    }
}
