
package model;

import java.util.ArrayList;

public class Borne {

    private Player owner;
    private int number;

    private static ArrayList<Card> north;
    private static ArrayList<Card> south;
    private static ArrayList<TacticCard> cardsOnTile;

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static ArrayList<Card> getNorth() {
        return north;
    }

    public static void setNorth(ArrayList<Card> north) {
        Borne.north = north;
    }

    public static ArrayList<Card> getSouth() {
        return south;
    }

    public static void setSouth(ArrayList<Card> south) {
        Borne.south = south;
    }

    public static ArrayList<TacticCard> getCardsOnTile() {
        return cardsOnTile;
    }

    public static void setCardsOnTile(ArrayList<TacticCard> cardsOnTile) {
        Borne.cardsOnTile = cardsOnTile;
    }
}
