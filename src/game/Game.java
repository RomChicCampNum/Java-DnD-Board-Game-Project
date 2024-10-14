package game;

import board.Board;
import board.EmptyCase;
import characters.Character;
import board.Case;
import enemies.Enemy;
import equipments.OffensiveGear;
import equipments.Potion;

import java.util.Random;

public class Game {

    private Character player;
    private Menu menu;
    private Board board; // nouveau plateau
    private int boardPosition;
    private int boardSize;
    private int diceFace;

    // Constructeur
    public Game() {
        this.menu = new Menu(); // L'instance de game.Menu
        this.board = new Board(); // Initialise le plateau
        this.boardSize = board.getCases().size(); // Taille du plateau dépendant du nombre du cases
        this.diceFace = 2; // Dé à x Faces
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

//        while (boardPosition < boardSize) {
            try {
                movePlayer();  // Gérer le déplacement du joueur
            } catch (CharacterOutsideOfBoardException e) {
                menu.showVictoryMessage(player);  // Message de victoire;
            }
//        }



        // Proposer de rejouer ou quitter
        if (menu.replayMenu()) {
            startGame();  // Relancer le jeu
        } else {
            menu.showExitGameMessage();  // Fin de la partie, retour au menu principal
        }
    }

    // Déplacement du joueur sur le plateau
    public void movePlayer() throws CharacterOutsideOfBoardException {
        int diceRoll = rollDice();
        boardPosition += diceRoll;

//        try {
            // Si la position dépasse le plateau, une exception est lancée
            if (boardPosition > boardSize) {
                int excess = boardPosition - boardSize;
                throw new CharacterOutsideOfBoardException(excess);
            }
//        } catch (CharacterOutsideOfBoardException excess) {
//            System.out.println(excess.getMessage());  // Message de l'exception
//            boardPosition = boardSize - (boardPosition - boardSize);  // Reculer d'autant de cases
//            if (boardPosition < 0) {
//                boardPosition = 0;
//            }
//        }
        // Afficher le message du déplacement
        menu.showMoveMessage(diceRoll, boardPosition, boardSize);

        // Interaction avec la case sur laquelle le joueur se trouve
        Case currentCase = board.getCases().get(boardPosition - 1);
        System.out.println("You enter in a new room...");

        // Gérer les interactions en fonction du type de la case
        currentCase.interact(player);
//        if (currentCase instanceof Enemy) {
//            Enemy enemy = (Enemy) currentCase;
//            enemy.interact(player);  // Interaction avec un ennemi
//        } else if (currentCase instanceof OffensiveGear) {
//            OffensiveGear gear = (OffensiveGear) currentCase;
//            gear.interact(player);
//        } else if (currentCase instanceof Potion) {
//            Potion potion = (Potion) currentCase;
//            potion.interact(player);  // Utiliser une potion
//        } else if (currentCase instanceof EmptyCase ) {
//            EmptyCase emptyCase = (EmptyCase) currentCase;
//            emptyCase.interact(player);
//        }
        movePlayer();
    }


    // Lancer un dé virtuel

    private int rollDice() {
        Random rand = new Random();
        return rand.nextInt(diceFace) + 1;  // Résultat entre 1 et 6
    }
}
