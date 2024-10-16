package equipments;

import characters.Character;

import java.util.Objects;

/**
 * Classe représentant un sort de givre (Frostbolt) en tant qu'équipement offensif.
 * Ce type d'équipement peut être équipé par un personnage de type "Magician".
 */

public class Frostbolt extends OffensiveGear {

    /**
     * Constructeur par défaut de la classe Frostbolt.
     * Initialise le sort de givre avec le nom "Frostbolt", de type "Spell", un niveau de puissance de 2 et un emoji pour le représenter.
     */

    public Frostbolt() {
        super("Frostbolt", "Spell", 1, "❄\uFE0F");
    }

    /**
     * Interaction avec un personnage sur une case contenant un sort de givre.
     * Si le personnage est de type "Magician", il équipe le sort et sa puissance d'attaque est augmentée.
     * Si le personnage n'est pas un magicien, il ne peut pas équiper ce sort.
     *
     * @param character Le personnage qui interagit avec l'équipement.
     * @return Une chaîne de caractères indiquant si l'équipement a été équipé ou non.
     */

    @Override
    public String interact(Character character) {
        if (Objects.equals(character.getType(), "Magician")) {
            character.setOffensiveGear(this);
            System.out.println("This room contains a library, you find a scroll \uD83D\uDCDC \ndescribing the spell " + getName()  + " " + getEmoji());
            return "equipGear";
        } else {
            System.out.println("This room contains a library, ou can't use spell scrolls, you keep moving until you reach the next room");
            return "dontEquipGear";
        }
    }
}