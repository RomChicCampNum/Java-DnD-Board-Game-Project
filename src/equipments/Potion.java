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

    @Override
    public String interact(Character character) {
        return "This room contains a little cabinet, you grab a " + name + " \uD83E\uDDEA";
    }
}