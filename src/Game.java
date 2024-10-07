import java.awt.*;
import java.util.Scanner;
import java.util.Random;

public class Game {

    // Coeur du jeu : 1 personnage, un avancement plateau, appels au menu

    private Character player;
    private Menu menu; // Instance du Menu
    private int boardPosition; // position actuelle sur le plateau
    private int boadSize = 64; // taille du plateau

    // Constructeur
    public Game () {
        this.menu = new Menu(this); // Passe l'instance de Game à Menu
    }

    public void setPlayer(Character player) {
    this.player = player; // Définit le personnage joueur
    }

    public Character getPlayer() {
        return this.player; // Retourne le personnage du joueur
    }

    // Démarrer la partie

    public void startGame() {
        boardPosition = 1;
        System.out.println(player.getName() + "is starting on case " + boardPosition + " / " + boadSize);

        while (boardPosition < boadSize) {
            movePlayer();
        }

        System.out.println("\n✨ Congatulations "+ player.getName() + ", you reached the end of the Dungeon! ✨\n");

        // proposer de rejouer ou de quitter

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? (yes/no)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes")) {
            startGame();  // Relancer le jeu
        } else {
            System.out.println("\nThanks for playing! Goodbye.");
        }
    }

    // Méthode pour aficher le menu principal
    public void start () {
        menu.displayMainMenu(); // Affiche le menu
    }

    //Déplace le joueur sur le plateau
    public void movePlayer() {
        int diceRoll = rollDice();
        boardPosition += diceRoll;

        // Empêcher de dépasser la dernière case
        if (boardPosition >= boadSize) {
            boardPosition = boadSize;
        }
        System.out.println("You rolled a "+ diceRoll +"! You are now on case " + boardPosition + " / " + boadSize);
    }

    // Méthode pour lancer le dé virtuel
    private int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1; // résultat entre 1 et 6
    }


}