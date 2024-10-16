package equipments;

import characters.Character;

import java.util.Objects;

/**
 * Classe représentant une massue (Club) en tant qu'équipement offensif.
 * Ce type d'équipement peut être équipé par un personnage de type "Warrior".
 */


public class Club extends OffensiveGear {

    /**
     * Constructeur par défaut de la classe Club.
     * Initialise la massue avec le nom "Club", de type "Mace", un niveau de puissance de 1 et un emoji pour la représenter.
     */

    public Club() {
        super("Club", "Mace", 1, "\uD83D\uDD28");
    }


    /**
     * Interaction avec un personnage sur une case contenant une massue.
     * Si le personnage est de type "Warrior", il équipe la massue et sa puissance d'attaque est augmentée.
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

