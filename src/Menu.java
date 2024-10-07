import java.sql.SQLOutput;
import java.util.*;

public class Menu {

    private Game game;

    //Constructeur qui prend l'instance du jeu pou intéragir avec
    public Menu(Game game) {
        this.game = game;
    }

    // Méthode principale du menu
    public void displayMainMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Dungeons and Dragons \uD83C\uDFF0 \uD83C\uDFB2 \uD83D\uDC32");
        System.out.println("1 - Create a character");
        System.out.println("2 - Start a new game");
        System.out.println("3 - Exit game");
        System.out.print("Enter your choice: ");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                createCharacterMenu(); // Affiche le menu de création de personnage
                break;
            case 2:
                startGameMenu(); // Démarre la partie
                break;
            case 3:
                System.out.println("Exiting the game. Goodbye!");
                break;
            default:
                System.out.println("\n" +
                        "Invalid choice, try again.");
                displayMainMenu();  // Relancer le menu si choix incorrect
                break;
        }
    }


//Méthode pour créer un personnage

    private void createCharacterMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Creating a new character !");
        System.out.println("What is the name of your character ?");
        String name = scan.nextLine();


        System.out.println("Which type is your character, Warrior or Magician ?");
        String type = scan.nextLine();

        Character character = new Character(name, type);  // Créer un nouveau personnage
        game.setPlayer(character);  // Assigner le personnage à l'instance de Game

        System.out.println("Character created successfully! ! \n");
        System.out.println(character);  // Appelle le toString() de Character pour afficher les infos

        // Retour au menu principal après création
        displayMainMenu();
    }


// Méthode pour démarrer la partie

    public void startGameMenu() {
        if (game.getPlayer() == null) {
            System.out.println("You must create a character before starting the game!");
        } else {
            System.out.println("\nStarting the game...");
            game.startGame();  // Appelle la méthode startGame dans Game pour démarrer
        }
    }
}