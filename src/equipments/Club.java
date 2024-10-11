package equipments;

import characters.Character;

public class Club extends OffensiveGear {

    public Club() {
        super("Club", "Mace", 1, "\uD83D\uDD28");
    }



    @Override
    public String interact(Character character) {
        return "This room contains a weapon rack, you pick a " + getName() + " \uD83D\uDD28";
    }
}

