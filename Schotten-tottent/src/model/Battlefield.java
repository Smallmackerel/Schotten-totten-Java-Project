package model;

import java.util.ArrayList;
import java.util.List;

import model.card.Card;
import model.card.tacticCard.TacticCard;
import model.player.Player;

public class Battlefield {

    private static int counter = 0;
    private final int id;
    private List<Card> north = new ArrayList<>();
    private List<Card> south = new ArrayList<>();
    private List<TacticCard> cardsOnBattlefield = new ArrayList<>();
    private Player owner;

    public Battlefield(){
        this.id = ++counter; 
    }

    public int getId() {
        return id;
    }

    public List<Card> getNorth() {
        return north;
    }

    public List<Card> getSouth() {
        return south;
    }

    public List<TacticCard> getCardsOnBattlefield() {
        return cardsOnBattlefield;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
