package game;

import characters.Character;
import characters.Warrior;
import characters.Magician;
import equipments.*;


import java.util.Scanner;

public class Menu {


    public Menu() {

    }

    // Méthode principale du menu
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

    // Méthode pour créer un personnage
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

    // Méthode pour proposer de rejouer ou quitter
    public boolean replayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? (yes/no)");
        String response = scanner.nextLine().toLowerCase();
        return response.equals("yes");
    }

    // Message de début de partie
    public void showStartGameMessage(Character player, int boardPosition, int boardSize) {
        System.out.println("\n" + player.getName() + " is starting on case " + boardPosition + " / " + boardSize);
    }

    // Message de déplacement
    public void showMoveMessage(int diceRoll, int boardPosition, int boardSize) {
        System.out.println("\nYou rolled a " + diceRoll + "! You are now on case " + boardPosition + " / " + boardSize);
    }

    // Message de victoire
    public void showVictoryMessage(Character player) {
        System.out.println("\n✨ Congratulations " + player.getName() + ", you reached the end of the Dungeon! ✨\n");
    }

    //Message de fin de partie
    public void showExitGameMessage() {
        System.out.println("\nExiting the Dungeon, return to main menu. \n");
    }

    // Message de fin
    public void showExitMessage() {
        System.out.println("\nExiting the game. Goodbye!\n");
    }
}
