public class Game {

    // Coeur du jeu : 1 personnage, un avancement plateau, appels au menu

    private Character player;
    //private Board map;
    private Menu menu;


    //Constructeur
     public Game() {
         // this.map = new map ();
            this.menu = new Menu();
     }

     public void start () {
         menu.displayMainMenu(); //Affiche le menu principal
     }





    // Méthode pour assigner le personnage créé
//    public Character setCharacter(Character character) {
//       return player = character;
//    }
//
//    // Méthode pour afficher les infos du personnage
//    public void displayCharacterInfo(player) {
//        if (player != null) {
//            System.out.println(player);  // Appelle le toString() du personnage
//            player.displayEquipments();  // Affiche les équipements du personnage
//        } else {
//            System.out.println("Aucun personnage n'a été créé.");
//        }
//    }

    // Méthode pour gérer le déplacement sur le plateau (prochaines étapes)
    //public void playTurn() {
        // Implémentation future pour gérer les tours et l'avancement sur le plateau
    }

