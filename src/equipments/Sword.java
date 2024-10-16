package equipments;

import characters.Character;

import java.util.Objects;


/**
 * Classe représentant une épée (Sword) en tant qu'équipement offensif.
 * Ce type d'équipement peut être équipé par un personnage de type "Warrior".
 */

public class Sword extends OffensiveGear {

    /**
     * Constructeur par défaut de la classe Sword.
     * Initialise l'épée avec le nom "Sword", de type "Sword", un niveau de puissance de 5 et un emoji pour la représenter.
     */

    public Sword() {
        super("Sword", "Sword", 3, " \uD83D\uDDE1\uFE0F ");
    }

    /**
     * Interaction avec un personnage sur une case contenant une épée.
     * Si le personnage est de type "Warrior", il équipe l'épée et sa puissance d'attaque est augmentée.
     * Si le personnage n'est pas un guerrier, il ne peut pas équiper cette arme.
     *
     * @param character Le personnage qui interagit avec l'équipement.
     * @return Une chaîne de caractères indiquant si l'équipement a été équipé ou non.
     */

    @Override
    public String interact(Character character) {
        if (Objects.equals(character.getType(), "Warrior")) {
            character.setOffensiveGear(this);
            System.out.println("This room contains a weapon rack, you pick a " + getName()  + " " + getEmoji() +
                    "\n Your Attack Power is now " + character.getStrength() + getLevel());
            return "equipGear";
        } else {
            System.out.println("This room contains a weapon rack, ou can't equip weapons, you keep moving until you reach the next room");
            return "dontEquipGear";
        }
    }
}
