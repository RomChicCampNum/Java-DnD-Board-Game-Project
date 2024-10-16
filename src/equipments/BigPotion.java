package equipments;

import board.Case;
import characters.Character;

/**
 * Classe représentant une potion de soin.
 * Ce type d'équipement permet de restaurer les points de vie d'un personnage lorsqu'il est utilisé.
 */

public class BigPotion extends Potion implements Case {

    /**
     * Constructeur par défaut de la classe BigPotion.
     * Initialise la grande potion avec le nom "Big Healing Potion", de type "Potion", un niveau de soin de 5, et un emoji pour la représenter.
     */

    public BigPotion() {
        super("Big healing Potion", 5, "\uD83E\uDDEA");
    }

    /**
     * Interaction avec un personnage sur une case contenant une grande potion de soin.
     * Le personnage boit la potion, ce qui augmente significativement ses points de vie.
     *
     * @param character Le personnage qui interagit avec l'équipement.
     * @return Une chaîne de caractères indiquant si la potion a été utilisée ou non.
     */

    @Override
    public String interact(Character character) {
        character.setHp(character.getHp() + healpower);
        System.out.println("This room contains a little cabinet, you grab a " + name  + " " + getEmoji() +
                "\nYou  drink it and heal yourself!" +
                "\nYour HP are now: " + character.getHp() + " ❤\uFE0F \n");
        return "drinkPotion";
    }
}