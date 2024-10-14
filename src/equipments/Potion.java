package equipments;

import board.Case;
import characters.Character;

public class Potion implements Case {

    protected String name;
    protected int healpower;
    protected String emoji;

    // Constructeur
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

    @Override
    public String interact(Character character) {
        character.setHp(character.getHp() + healpower);
        System.out.println("This room contains a little cabinet, you grab a " + name  + " " + getEmoji() +
                "\nYou  drink it and heal yourself!" +
                "\nYour HP are now: " + character.getHp() + " ❤\uFE0F \n");
        return "drinkPotion";
    }
}