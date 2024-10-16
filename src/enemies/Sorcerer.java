package enemies;

import board.Case;

/**
 * Classe représentant un sorcier, un type d'ennemi dans le jeu.
 * Les sorciers utilisent la magie pour attaquer avec une force modérée.
 */

public class Sorcerer extends Enemy implements Case {

    /**
     * Constructeur de la classe Sorcerer.
     * Initialise un sorcier avec des points de vie, une force d'attaque et un emoji spécifique.
     */

    public Sorcerer() {
        super("Sorcerer", 9, 2, " \uD83E\uDDDD");
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du sorcier.
     * Indique les points de vie et la force d'attaque spécifiques à un sorcier.
     *
     * @return une chaîne contenant les informations sur le sorcier.
     */

    @Override
    public String toString() {
        return  "\nSorcerer " + this.emoji +": " +
                "\n HP ❤\uFE0F: " + this.hp +
                "\nAttack Power ⚔\uFE0F: " + this.strength +
                "\n";
    }
}