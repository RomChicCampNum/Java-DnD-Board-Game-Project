package game;

import characters.Character;
import characters.Warrior;
import characters.Magician;
import equipments.*;


import java.util.Scanner;

/**
 * Classe représentant le menu du jeu.
 * Gère l'affichage des options et les interactions avec le joueur.
 */

public class Menu {


    public Menu() {

    }

    /**
     * Affiche le menu principal et retourne le choix du joueur.
     *
     * @return Le choix du joueur comme un entier.
     */

    public int displayMainMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Dungeons and Dragons \uD83C\uDFF0 \uD83C\uDFB2 \uD83D\uDC32");
        System.out.println("1 - Create a character");
        System.out.println("2 - Start a new game");
        System.out.println("3 - Exit game");
        System.out.print("Enter your choice: ");

        int choice = scan.nextInt();
        return choice;  // Retourne le choix à la classe game.Game pour la logique
    }

    /**
     * Affiche le menu pour créer un personnage et retourne le personnage créé.
     *
     * @return Le personnage créé.
     */

    public Character createCharacterMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nCreating a new character ! \n");
        System.out.println("What is the name of your character ?");
        String name = scan.nextLine();

        System.out.println("Which type is your character, Warrior or Magician ?");
        String type = scan.nextLine();

        // Créer une personnage basé sur le type

        if (type.equalsIgnoreCase("Warrior")) {
            return new Warrior(name, type);  // Return a new warrior character

        } else if (type.equalsIgnoreCase("Magician")) {
            return new Magician(name, type);  // Return a new magician character

        } else {
            System.out.println("Invalid character type. Please try again.");
            return createCharacterMenu();
        }
    }

    /**
     * Propose au joueur de rejouer ou de quitter le jeu.
     *
     * @return true si le joueur souhaite rejouer, false sinon.
     */

    public boolean replayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? (yes/no)");
        String response = scanner.nextLine().toLowerCase();
        return response.equals("yes");
    }

    /**
     * Affiche un message de début de partie.
     *
     * @param player Le personnage du joueur.
     * @param boardPosition La position du joueur sur le plateau.
     * @param boardSize La taille du plateau.
     */

    public void showStartGameMessage(Character player, int boardPosition, int boardSize) {
        System.out.println("\n" + player.getName() + " is starting on case " + boardPosition + " / " + boardSize);
    }

    /**
     * Affiche un message lors du déplacement du joueur.
     *
     * @param diceRoll Le résultat du lancer de dés.
     * @param boardPosition La nouvelle position du joueur sur le plateau.
     * @param boardSize La taille du plateau.
     */

    public void showMoveMessage(int diceRoll, int boardPosition, int boardSize) {
        System.out.println("\nYou rolled a " + diceRoll + "! You are now on case " + boardPosition + " / " + boardSize);
    }

    /**
     * Affiche un message de victoire.
     *
     * @param player Le personnage du joueur.
     */

    public void showVictoryMessage(Character player) {
        System.out.println("\n✨ Congratulations " + player.getName() + ", you reached the end of the Dungeon! ✨\n");
    }

    /**
     * Affiche un message de fin de jeu.
     */

    public void showExitGameMessage() {
        System.out.println("\nExiting the Dungeon, return to main menu. \n");
    }

    /**
     * Affiche un message de sortie du jeu.
     */
    public void showExitMessage() {
        System.out.println("\nExiting the game. Goodbye!\n");
    }
}
