package equipments;

import board.Case;
import characters.Character;

public abstract class DefensiveGear implements Case {

    protected String name;
    protected String type;
    protected int level;
    protected String emoji;


    // Constructeur principal equipments.DefensiveGear
    public DefensiveGear(String name, String type, int level, String emoji) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.emoji = emoji;

    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String interact(Character character) {

        return "";
    }

    // Méthode toString pour afficher les informations du DeffensiveGear
    public String toString() {
        return this.name + " " + this.emoji;
    }
}


