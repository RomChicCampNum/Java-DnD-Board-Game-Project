package characters;

import equipments.*;

public abstract class Character {

    protected String name;
    protected String type;
    protected int hp;
    protected int strength;
    protected DefensiveGear defensiveGear;
    protected OffensiveGear offensiveGear;


    /**
     * Classe abstraite représentant un personnage dans le jeu.
     * Cette classe contient les attributs communs à tous les types de personnages jouables
     * ainsi que des méthodes pour interagir avec ces attributs.
     */

    /**
     * Constructeur par défaut, crée un personnage avec le nom "NPC" et type par défaut "Warrior".
     */
    public Character() {
        this("NPC"); // Nom par défaut
    }

    /**
     * Constructeur secondaire, crée un personnage avec un nom personnalisé et type par défaut "Warrior".
     *
     * @param name Le nom du personnage.
     */
    public Character(String name) {
        this(name, "Warrior");
    }

    /**
     * Constructeur principal, crée un personnage avec un nom et un type spécifiés.
     *
     * @param name Le nom du personnage.
     * @param type Le type de personnage (ex: Warrior, Magician).
     */
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

    /**
     * Retourne une représentation sous forme de chaîne de caractères des attributs du personnage,
     * incluant son nom, type, points de vie, force, et équipements offensif et défensif.
     *
     * @return Une chaîne de caractères représentant le personnage.
     */

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
                "\n" + "\uD83D\uDDE1\uFE0F: " + this.offensiveGear +
                "\n" + "\uD83D\uDEE1\uFE0F: " + this.defensiveGear +
                "\n";
    }
}
