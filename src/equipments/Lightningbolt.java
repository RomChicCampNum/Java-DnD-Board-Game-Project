package equipments;

import characters.Character;

import java.util.Objects;

/**
 * Classe représentant un sort d'éclair (Lightningbolt) en tant qu'équipement offensif.
 * Ce type d'équipement peut être équipé par un personnage de type "Magician".
 */

public class Lightningbolt extends OffensiveGear {

    /**
     * Constructeur par défaut de la classe Lightningbolt.
     * Initialise le sort d'éclair avec le nom "Lightningbolt", de type "Spell", un niveau de puissance de 3 et un emoji pour le représenter.
     */

    public Lightningbolt() {
        super("Lightning bolt", "Spell", 1, "⚡");
    }

    /**
     * Interaction avec un personnage sur une case contenant un sort d'éclair.
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