package equipments;

import characters.Character;

/**
 * Classe représentant un anneau de protection dans le jeu.
 * La classe Ring hérite de DefensiveGear et représente un équipement défensif
 * spécifique que les personnages peuvent utiliser.
 */

public class Ring extends DefensiveGear {

    /**
     * Constructeur par défaut pour la classe Ring.
     * Crée un anneau avec un nom, un type, un niveau et un emoji prédéfinis.
     */

    public Ring() {
        super("Protection Ring", "Ring", 1, " \uD83D\uDC8D");
    }

    /**
     * Gère l'interaction entre l'anneau et un personnage.
     *
     * @param character Le personnage qui interagit avec l'anneau.
     * @return Une chaîne de caractères représentant le nom de l'anneau et son emoji.
     */

    @Override
    public String interact(Character character) {
        return getName() + "\uD83D\uDC8D";
    }
}
