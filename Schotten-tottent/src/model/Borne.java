package model;
import java.util.ArrayList;

public class Borne {
    private Joueur prise;
    private int numero;
    private static ArrayList<Carte> North;
    private static ArrayList<Carte> South;
    private static ArrayList<CarteTactique> onTile;
    
    public Joueur getPrise() {
        return prise;
    }
    public void setPrise(Joueur prise) {
        this.prise = prise;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public static ArrayList<Carte> getNorth() {
        return North;
    }
    public static void setNorth(ArrayList<Carte> north) {
        North = north;
    }
    public static ArrayList<Carte> getSouth() {
        return South;
    }
    public static void setSouth(ArrayList<Carte> south) {
        South = south;
    }
    public static ArrayList<CarteTactique> getOnTile() {
        return onTile;
    }
    public static void setOnTile(ArrayList<CarteTactique> onTile) {
        Borne.onTile = onTile;
    }
    

}
