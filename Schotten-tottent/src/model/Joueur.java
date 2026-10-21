package model;
import java.util.ArrayList;


public class Joueur {
    private String nom;
    private int cote;
    private static ArrayList<Carte> cartePossedees;
    
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return nom;
    }

    public void setCote(int cote){
        this.cote = cote;
    }

    public int getCote(){
        return cote;
    }

    public static void addCarte(Carte carte){
        cartePossedees.add(carte);
    }

    public static void removeCarte(Carte carte){
        cartePossedees.remove(carte);
    }

    

}
