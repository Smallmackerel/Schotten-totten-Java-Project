package model;
import java.util.ArrayList;


public class Pile {
    public static ArrayList<Carte> pileCarte;

    public static ArrayList<Carte> getPileCarte() {
        return pileCarte;
    }

    public static void setPileCarte(ArrayList<Carte> pileCarte) {
        Pile.pileCarte = pileCarte;
    }
}
