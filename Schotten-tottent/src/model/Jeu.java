package model;
import java.util.ArrayList;


public class Jeu {
    private static ArrayList<Borne> listeBornes;
    private static ArrayList<CarteClan> pileClan;
    private static ArrayList<CarteTactique> pileTactique;
    private static ArrayList<Joueur> joueurs;
    
    public static ArrayList<Borne> getListeBornes() {
        return listeBornes;
    }
    public static void setListeBornes(ArrayList<Borne> listeBornes) {
        Jeu.listeBornes = listeBornes;
    }
    public static ArrayList<CarteClan> getPileClan() {
        return pileClan;
    }
    public static void setPileClan(ArrayList<CarteClan> pileClan) {
        Jeu.pileClan = pileClan;
    }
    public static ArrayList<CarteTactique> getPileTactique() {
        return pileTactique;
    }
    public static void setPileTactique(ArrayList<CarteTactique> pileTactique) {
        Jeu.pileTactique = pileTactique;
    }
    public static ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }
    public static void setJoueurs(ArrayList<Joueur> joueurs) {
        Jeu.joueurs = joueurs;
    }
    
}
