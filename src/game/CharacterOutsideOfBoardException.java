package game;

public class CharacterOutsideOfBoardException extends Exception {
    public CharacterOutsideOfBoardException(int excess) {
        super("\nPlayer has exceeded the board by " + excess +" spaces !\n");
    }
}
