package model;

import java.util.ArrayList;
import java.util.List;

import controller.communication.GameMessage;
import controller.communication.PlayerResponse;

public abstract class Player {

    private String name;
    private PlayerSide side;
    private List<Card> cards = new ArrayList<>();

    public Player(String name, PlayerSide side){
        this.name = name;
        this.side = side;
    }

    public abstract PlayerResponse receive(GameMessage gameMessage);

    public String getName() {
        return name;
    }

    public PlayerSide getSide() {
        return side;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public void removeCard(Card card){
        this.cards.remove(card);
    }
}