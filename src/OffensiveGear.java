public class OffensiveGear {

    private String name;
    private String type;
    private int level;

    // Constructeur principal OffensiveGear
    public OffensiveGear(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
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

    // Méthode toString pour afficher les informations du OffensiveGear
    public String toString() {
        return "Nom: " + this.name + ", Type: " + this.type + "Niveau: " + this.level;
    }
}
