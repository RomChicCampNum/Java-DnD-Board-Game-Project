package equipments;

public abstract class OffensiveGear {

    protected String name;
    protected String type;
    protected int level;

    // Constructeur principal equipments.OffensiveGear
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

    // Méthode toString pour afficher les informations du equipments.OffensiveGear
    public String toString() {
        return "\uD83D\uDDE1\uFE0F: " + this.name;
    }
}
