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
        character.setHp(character.getHp() + healpower);
        System.out.println("This room contains a little cabinet, you grab a " + name  + " " + getEmoji() +
                "\nYou  drink it and heal yourself!" +
                "\nYour HP are now: " + character.getHp() + " ❤\uFE0F \n");
        return "drinkPotion";
    }
}