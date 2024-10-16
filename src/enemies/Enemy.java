package enemies;

import board.Case;
import characters.Character;

import java.util.Objects;

/**
 * Classe abstraite représentant un ennemi dans le jeu.
 * Chaque ennemi a un type, des points de vie (HP), une force d'attaque et un emoji qui le représente visuellement.
 */

public abstract class Enemy implements Case {

    private String type;
    protected int hp;
    protected int strength;
    protected String emoji;

    /**
     * Constructeur de la classe Enemy.
     *
     * @param type      Le type d'ennemi (par exemple Gobelin, Sorcerer).
     * @param hp        Les points de vie de l'ennemi.
     * @param strength  La force d'attaque de l'ennemi.
     * @param emoji     L'emoji représentant l'ennemi.
     */

    public Enemy(String type, int hp, int strength, String emoji) {
        this.type = type;
        this.hp = hp;
        this.strength = strength;
        this.emoji = emoji;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }

    public String getEmoji() {
        return emoji;
    }

    /**
     * Interaction entre un personnage et un ennemi.
     * Si le personnage attaque et tue l'ennemi, il accède à la pièce suivante. Si l'ennemi gagne, le personnage est vaincu.
     *
     * @param character Le personnage qui interagit avec l'ennemi.
     * @return Une chaîne de caractères indiquant le résultat du combat (Victoire, Défaite, ou En cours).
     */

    @Override
    public String interact(Character character) {
        System.out.printf("\nBehind the door of this room, an enemy is waiting for you ! Prepare to fight the " + getType() + " " + getEmoji() + "!");
        while (this.hp >= 0 || character.getHp() >= 0) {
            System.out.printf("\nYou attack ! \n");
            if (Objects.equals(character.getType(), "Warrior")) {
                System.out.println("You strike with your " + character.getOffensiveGear() + " !\n");
            } else {
                System.out.println("You launch a " + character.getOffensiveGear() + " spell !\n");
            }
            hp -= character.getStrength();
            if (hp <= 0) {
                System.out.println("Hurray ! You killed the " + getType() + " " + getEmoji() + "! You can access the next room ! \n");
                return "Victory"; // Retourne une état de victoire
            } else {
                System.out.println("The " + getType() + " fights back !\n");
                character.setHp(character.getHp() - strength);
                System.out.println("Your HP are now " + character.getHp());
            }
            if (character.getHp() <= 0) {
                System.out.println("You have been defeated by the " + getType() + " " + getEmoji() + "!\n");
                return "Defeated"; // Retourne une état de défaite
            }

        }
        return "Ongoing";
    }

    public String toString() {
        return "\nEnemy \uD83D\uDC79: " + this.type +
                "\n HP ❤\uFE0F: " + this.hp +
                "\nAttack Power ⚔\uFE0F: " + this.strength +
                "\n";
    }
}
