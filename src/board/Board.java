package board;

import equipments.Sword;
import equipments.Mace;
import equipments.Lightningbolt;
import equipments.Fireball;

import equipments.Potion;
import equipments.BigPotion;

import enemies.Gobelin;
import enemies.Sorcerer;
import enemies.Drake;

import java.util.ArrayList;

public class Board {
    private ArrayList<Case> cases;

    public Board() {
        cases = new ArrayList<>();
        initializeBoard(); // Initialise les cases lors de la création du plateau
    }

    //Initialiser les cases du plateau
    private void initializeBoard() {
        cases.add(new EmptyCase());
        cases.add(new Gobelin());
        cases.add(new Sword());
        cases.add(new Potion());
    }

    //Retourne la liste
    public ArrayList<Case> getCases() {
        return cases;
    }
}
