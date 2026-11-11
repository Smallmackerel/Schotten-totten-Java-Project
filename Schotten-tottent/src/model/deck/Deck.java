package model.deck;

import java.util.ArrayList;
import java.util.List;

import model.card.Card;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
