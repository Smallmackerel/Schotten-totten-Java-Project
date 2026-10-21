package model;

import java.util.ArrayList;

public class PileTactique extends Pile{
    public static ArrayList<CarteTactique> carteTactique;
    public static ArrayList<CarteClan> carteClan;
    
    public static ArrayList<CarteTactique> getCarteTactique() {
        return carteTactique;
    }
    public static void setCarteTactique(ArrayList<CarteTactique> carteTactique) {
        PileTactique.carteTactique = carteTactique;
    }
    public static ArrayList<CarteClan> getCarteClan() {
        return carteClan;
    }
    public static void setCarteClan(ArrayList<CarteClan> carteClan) {
        PileTactique.carteClan = carteClan;
    }
    
    
}
