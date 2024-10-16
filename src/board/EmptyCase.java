package board;

import characters.Character;

/**
 * Classe représentant une case vide sur le plateau de jeu.
 * Les cases vides ne contiennent rien d'intéressant.
 */

public class EmptyCase implements Case {

    /**
     * Interaction avec un personnage sur une case vide.
     *
     * @param character Le personnage qui interagit avec la case.
     * @return Un message indiquant que la case est vide.
     */

    @Override
    public String interact(Character character) {
        System.out.println("You enter an empty room. There's nothing there but rubbish and odds and ends.\n");
        return "emptycase";
    }
}
