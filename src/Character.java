import org.w3c.dom.ls.LSOutput;

public class Character {

    private String name;
    private String type;
    private int hp;
    private int strength;
    private DefensiveGear defensiveGear;
    private OffensiveGear offensiveGear;


    // Constructeur par défaut
    public Character() {
        this("NPC"); // Nom par défaut
    }

    // Constructeur secondaire Character
    public Character(String name) {
        this(name,"warrior");
    }

    // Constructeur principal avec équipements
    public Character(String name, String type) {
        this.name = name;
        this.type = type;

        // Attributs spécifiques aux types de personnages
        if (type.equals("warrior")) {
            this.hp = 10;
            this.strength = 10;
            this.defensiveGear = new DefensiveGear("wooden shield","shield", 1);
            this.offensiveGear = new OffensiveGear("rotten sword", "sword", 1);
        } else if (type.equals("magician")) {
            this.hp = 6;
            this.strength = 15;
            this.defensiveGear = new DefensiveGear("Rockskin potion", "potion", 1);
            this.offensiveGear = new OffensiveGear("wooden staff", "staff", 1);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Méthode toString pour afficher les informations du personnage
    public String toString() {
        return "Name: " + this.name + ", Type: " + this.type + ", Healthpoints: " + this.hp + ", Strenght: " + this.strength  +
                ", Stuff: " + this.offensiveGear + ", " + this.defensiveGear;
    }
}

