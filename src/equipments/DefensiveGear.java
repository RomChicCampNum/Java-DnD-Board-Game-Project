package equipments;

import board.Case;
import characters.Character;

/**
 * Classe abstraite représentant un équipement défensif dans le jeu.
 * Cette classe hérite de Case et contient les attributs communs aux équipements défensifs,
 * ainsi que des méthodes pour interagir avec le personnage.
 */

public abstract class DefensiveGear implements Case {

    protected String name;
    protected String type;
    protected int level;
    protected String emoji;


    /**
     * Constructeur principal pour la classe DefensiveGear.
     *
     * @param name  Le nom de l'équipement défensif.
     * @param type  Le type de l'équipement défensif.
     * @param level Le niveau de l'équipement défensif.
     * @param emoji L'emoji associé à l'équipement défensif.
     */

    // Constructeur principal equipments.DefensiveGear
    public DefensiveGear(String name, String type, int level, String emoji) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.emoji = emoji;

    }

    /** Getters et Setters
     */

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


    /**
     * Gère l'interaction entre l'équipement défensif et un personnage.
     * Cette méthode peut être redéfinie dans les sous-classes pour des interactions spécifiques.
     *
     * @param character Le personnage avec lequel l'équipement interagit.
     * @return Une chaîne de caractères représentant le résultat de l'interaction.
     */

    @Override
    public String interact(Character character) {

        return "";
    }

    // Méthode toString pour afficher les informations du DeffensiveGear
    public String toString() {
        return this.name + " " + this.emoji;
    }
}


