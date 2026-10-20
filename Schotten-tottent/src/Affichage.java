import java.util.ArrayList;

public class Affichage {
    public static void main(String[] args) {

        ArrayList<CarteTactique> pileTactique = new ArrayList<>();
        ArrayList<CarteClan> pileClan = new ArrayList<>();
        
        ArrayList<Joueur> joueurs = new ArrayList<>();

        joueurs.add(new Joueur("1", 0, cartePossedees));
        Joueur joueur1 = joueurs.get(0);
        ArrayList<Carte> carteJ1 = joueur1.cartePossedees;
        
        joueurs.add(new Joueur("2", 1, cartePossedees));
        Joueur joueur2 = joueurs.get(0);
        ArrayList<Carte> carteJ2 = joueur2.cartePossedees;



        System.out.println("Pile Tactique : " + pileTactique.getNombreCartes() + " cartes restantes");
        System.out.println("Pile Clan : " + pileClan.getNombreCartes() + " cartes restantes");
        
        System.out.println("Main joueur 1 (NORTH) : ");

        for (int i = 0; i < cartePossedees.getNombreCartes(); i++){
            System.out.println(carteJ1.getNomCarte(i) + " ");
        }

        System.out.println("\n");

        System.out.println("Main joueur 2 (SOUTH) : ");
        for (int i = 0; i < cartePossedees.getNombreCartes(); i++){
            System.out.println(carteJ2.getNomCarte(i) + " ");
        }

        System.out.println("\n\n\n");
        System.out.println("NORTH");
        System.out.println("\n\n");

        System.out.println(":");
        for(int i = 0; i< nombreBornes; i++){
            System.out.println(BornePriseParJ1ouJ2 + ":");
        }

        System.out.println("\n\n");

        for (int i = 0; i < 3; i++){
            System.out.println("|");
            for(int j = 0; j < nombreBornes; j++){
                System.out.println(Borne.j,North.i + "|");
            }
            System.out.println("\n");
        }

        for(int i = 0; i<9 ; i++){
            System.out.println("  " + onTile.(i) + "  ")
        }

        for (int i = 0; i < 3; i++){
            System.out.println("|");
            for(int j = 0; j < nombreBornes; j++){
                System.out.println(Borne.j,North.i + "|");
            }
            System.out.println("\n");
        }

        System.out.println("\n\n");
        System.out.println("SOUTH");
    }
}