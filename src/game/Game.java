package game;

import characters.Character;

import java.util.Random;

public class Game {

    private Character player;
    private Menu menu;
    private int boardPosition;
    private int boardSize = 64;

    // Constructeur
    public Game() {
        this.menu = new Menu(this); // L'instance de game.Menu
    }

    public void setPlayer(Character player) {
        this.player = player;
    }

    public Character getPlayer() {
        return this.player;
    }

    // Lancement du jeu
    public void start() {
        boolean running = true;
        while (running) {
            int choice = menu.displayMainMenu();  // Récupère le choix du joueur
            switch (choice) {
                case 1:
                    Character character = menu.createCharacterMenu();  // Créer un personnage
                    setPlayer(character);  // Affecter à l'instance
                    System.out.println("\nCharacter created successfully!\n" + character);  // Affichage dans game.Menu
                    break;
                case 2:
                    if (player == null) {
                        System.out.println("You must create a character before starting the game!\n");
                    } else {
                        startGame();  // Démarre la partie si un personnage existe
                    }
                    break;
                case 3:
                    menu.showExitMessage();  // Affiche le message de fin
                    running = false;  // Arrête le jeu
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    // Démarrer la partie
    public void startGame() {
        boardPosition = 1;
        menu.showStartGameMessage(player, boardPosition, boardSize);  // Message de début

        while (boardPosition < boardSize) {
            movePlayer();  // Gérer le déplacement du joueur
        }

        menu.showVictoryMessage(player);  // Message de victoire

        // Proposer de rejouer ou quitter
        if (menu.replayMenu()) {
            startGame();  // Relancer le jeu
        } else {
            menu.showExitGameMessage();  // Fin de la partie, retour au menu principal
        }
    }

    // Déplacement du joueur sur le plateau
    public void movePlayer() {
        int diceRoll = rollDice();
        boardPosition += diceRoll;

        try {
            // Si la position dépasse le plateau, une exception est lancée
            if (boardPosition > boardSize) {
                int excess = boardPosition - boardSize;
                throw new CharacterOutsideOfBoardException(excess);
            }
        } catch (CharacterOutsideOfBoardException e) {
            System.out.println(e.getMessage());  // Message de l'exception
            boardPosition = boardSize - (boardPosition - boardSize);  // Reculer d'autant de cases
        }

        menu.showMoveMessage(diceRoll, boardPosition, boardSize);
    }

    // Lancer un dé virtuel
    private int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;  // Résultat entre 1 et 6
    }
}