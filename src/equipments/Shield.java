package equipments;

import characters.Character;

/**
 * Classe représentant un bouclier dans le jeu.
 * La classe Shield hérite de DefensiveGear et représente un équipement défensif
 * spécifique que les personnages peuvent utiliser.
 */

public class Shield extends DefensiveGear {

    /**
     * Constructeur par défaut pour la classe Shield.
     * Crée un bouclier avec un nom, un type, un niveau et un emoji prédéfinis.
     */

    public Shield() {
        super("Wooden Shield", "Shield", 1, " \uD83D\uDEE1\uFE0F");
    }

    /**
     * Gère l'interaction entre le bouclier et un personnage.
     *
     * @param character Le personnage qui interagit avec le bouclier.
     * @return Une chaîne de caractères représentant le nom du bouclier et son emoji.
     */

    @Override
    public String interact(Character character) {
        return getName() + "\uD83D\uDEE1\uFE0F";
    }
}
