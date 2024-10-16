package board;

import characters.Character;

/**
 * Interface représentant une case sur le plateau de jeu.
 * Chaque case peut interagir avec un personnage.
 */

public interface Case {

    /**
     * Méthode pour interagir avec la case.
     *
     * @param character Le personnage qui interagit avec la case.
     * @return Une chaîne indiquant le résultat de l'interaction.
     */

    public String interact(Character character);
}
