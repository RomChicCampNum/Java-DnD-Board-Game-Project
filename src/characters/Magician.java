package characters;

import equipments.Lightningbolt;
import equipments.Fireball;
import equipments.Frostbolt;
import equipments.Ring;


/**
 * Classe représentant un magicien dans le jeu.
 * Cette classe hérite de la classe Character et initialise les attributs spécifiques au type de personnage "Magician".
 */


public class Magician extends Character {

    /**
     * Constructeur principal pour créer un magicien avec un nom et un type spécifié.
     *
     * @param name Le nom du magicien.
     * @param type Le type du personnage.
     */

    public Magician(String name, String type) {
        super(name, type);
        this.setHp(6);
        this.setStrength(15);
        this.setOffensiveGear(new Frostbolt());
        this.setDefensiveGear(new Ring());
    }
}
