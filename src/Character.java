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
        this(name, "Warrior");
    }

    // Constructeur principal avec équipements
    public Character(String name, String type) {
        this.name = name;
        this.type = type;

        // Attributs spécifiques aux types de personnages
        if (type.equals("Warrior")) {
            this.hp = 10;
            this.strength = 10;
            this.defensiveGear = new DefensiveGear("Wooden shield", "Shield", 1);
            this.offensiveGear = new OffensiveGear("Rotten sword", "Sword", 1);
        } else if (type.equals("Magician")) {
            this.hp = 6;
            this.strength = 15;
            this.defensiveGear = new DefensiveGear("Rockskin potion", "Potion", 1);
            this.offensiveGear = new OffensiveGear("Wooden staff", "Staff", 1);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Méthode toString pour afficher les informations du personnage
    public String toString()
    {
        // Choisir l'emoji en fonction du type
        String emoji = (this.type.equals("Warrior")) ? "⚔️" : "🧙";

        return "Name: " + this.name +
                "\nType: " + this.type + emoji +
                "\n HP ❤\uFE0F: " + this.hp +
                "\nATQ ⚔\uFE0F: " + this.strength +
                "\nEquipment: " +
                "\n" + this.offensiveGear +
                "\n" + this.defensiveGear +
                "\n\n";
    }
}

