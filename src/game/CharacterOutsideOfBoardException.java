package game;

/**
 * Exception levée lorsque le personnage dépasse les limites du plateau.
 */

public class CharacterOutsideOfBoardException extends Exception {

    /**
     * Constructeur de l'exception.
     *
     * @param excess Le nombre d'espaces dépassés par le personnage.
     */

    public CharacterOutsideOfBoardException(int excess) {
        super("\nPlayer has exceeded the board by " + excess +" spaces !\n");
    }
}
