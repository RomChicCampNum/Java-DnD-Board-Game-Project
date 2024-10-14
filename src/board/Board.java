package board;

import equipments.*;
import enemies.*;
import java.util.ArrayList;

public class Board {
    private ArrayList<Case> cases;
    private int boardSize = 64;

    public Board() {
        cases = new ArrayList<>();
        initializeBoard(); // Initialise les cases lors de la création du plateau
    }

    // Initialiser les cases du plateau
    private void initializeBoard() {
        for (int i = 1; i <= boardSize; i++) {
            switch (i) {
                // Gobelins
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> cases.add(new Gobelin());

                // Sorciers
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> cases.add(new Sorcerer());

                // Dragons
                case 45, 52, 56, 62 -> cases.add(new Drake());

                // Massues
                case 2, 5, 11, 22, 38 -> cases.add(new Mace());

                // Epées
                case 19, 26, 42, 53 -> cases.add(new Sword());

                // Sorts "éclair"
                case 1, 4, 8, 17, 23 -> cases.add(new Lightningbolt());

                // Sorts "boules de feu"
                case 48, 49 -> cases.add(new Fireball());

                // Potions standards
                case 7, 13, 31, 33, 39, 43 -> cases.add(new Potion());

                // Grandes Potions
                case 28, 41 -> cases.add(new BigPotion());

                // Cases vides
                default -> cases.add(new EmptyCase());
            }
        }
    }

    // Retourne la liste des cases
    public ArrayList<Case> getCases() {
        return cases;
    }
}
