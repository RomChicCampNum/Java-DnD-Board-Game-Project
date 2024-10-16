package equipments;

import board.Case;
import characters.Character;

/**
 * Classe représentant une potion de soin.
 * Ce type d'équipement permet de restaurer les points de vie d'un personnage lorsqu'il est utilisé.
 */

public class Potion implements Case {

    protected String name;
    protected int healpower;
    protected String emoji;

    /**
     * Constructeur par défaut de la classe Potion.
     * Initialise la potion avec le nom "Healing Potion", de type "Potion", un niveau de soin de 2, et un emoji pour la représenter.
     */

    public Potion(String name, int healpower, String emoji) {
        this.name = name;
        this.healpower = healpower;
        this.emoji = emoji;
    }

    public Potion() {
        this("Healing Potion", 2, "\uD83E\uDDEA");
    }

    public String getName() {
        return name;
    }

    public int getHealpower() {
        return healpower;
    }

    @Override
    public String toString() {
        return name + " " + healpower;
    }

    public String getEmoji() {
        return emoji;
    }

    /**
     * Interaction avec un personnage sur une case contenant une potion de soin.
     * Le personnage boit la potion, ce qui augmente ses points de vie.
     *
     * @param character Le personnage qui interagit avec l'équipement.
     * @return Une chaîne de caractères indiquant si la potion a été utilisée ou non.
     */

    @Override
    public String interact(Character character) {
        character.setHp(character.getHp() + healpower);
        System.out.println("This room contains a little cabinet, you grab a " + name + " " + getEmoji() +
                "\nYou  drink it and heal yourself!" +
                "\nYour HP are now: " + character.getHp() + " ❤\uFE0F \n");
        return "drinkPotion";
    }
}