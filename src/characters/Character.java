package characters;

import equipments.DefensiveGear;
import equipments.OffensiveGear;
import equipments.Shield;
import equipments.Club;
import equipments.Mace;
import equipments.Sword;
import equipments.Lightningbolt;
import equipments.Frostbolt;
import equipments.Fireball;

public abstract class Character {

    protected String name;
    protected String type;
    protected int hp;
    protected int strength;
    protected DefensiveGear defensiveGear;
    protected OffensiveGear offensiveGear;


    // Constructeur par défaut
    public Character() {
        this("NPC"); // Nom par défaut
    }

    // Constructeur secondaire Character
    public Character(String name) {
        this(name, "Warrior");
    }

    // Constructeur principal avec équipements
    public Character(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Getters et Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public DefensiveGear getDefensiveGear() {
        return defensiveGear;
    }

    public void setDefensiveGear(DefensiveGear defensiveGear) {
        this.defensiveGear = defensiveGear;
    }

    public OffensiveGear getOffensiveGear() {
        return offensiveGear;
    }

    public void setOffensiveGear(OffensiveGear offensiveGear) {
        this.offensiveGear = offensiveGear;
    }

    // Méthode toString pour afficher les informations du personnage
    public String toString()
    {
        // Choisir l'emoji en fonction du type
        String emoji = (this.type.equals("Warrior")) ? "⚔️" : "🧙";

        return "Name: " + this.name +
                "\nType: " + this.type + " " + emoji +
                "\nHP ❤\uFE0F: " + this.hp +
                "\nAttack Power ⚔\uFE0F: " + this.strength +
                "\nEquipment: " +
                "\n" + this.offensiveGear +
                "\n" + this.defensiveGear +
                "\n";
    }
}

