package equipments;

import board.Case;
import characters.Character;

public class BigPotion extends Potion implements Case {

    // Constructeur
    public BigPotion() {
       super("Big healing Potion", 5, "\uD83E\uDDEA");
    }


    @Override
    public String interact(Character character) {
        return "This room contains a little cabinet, you grab a " + getName() + " \uD83E\uDDEA";
    }
}