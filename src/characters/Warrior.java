package characters;

import equipments.Club;
import equipments.Mace;
import equipments.Sword;
import equipments.Shield;

/**
 * Classe représentant un guerrier dans le jeu.
 * Cette classe hérite de la classe Character et initialise les attributs spécifiques au type de personnage "Warrior".
 */

public class Warrior extends Character {

    /**
     * Constructeur principal pour créer un guerrier avec un nom et un type spécifié.
     *
     * @param name Le nom du guerrier.
     * @param type Le type du personnage.
     */


    public Warrior (String name, String type) {
        super(name, type);
        this.setHp(10);
        this.setStrength(10);
        this.setOffensiveGear(new Club());
        this.setDefensiveGear(new Shield());
    }
}
