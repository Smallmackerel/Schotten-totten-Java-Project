package model.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.card.Card;

public abstract class Deck {

    protected List<Card> cards = new ArrayList<>();

    protected abstract void initialize();

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public Card drawCard() {
        if (this.cards.isEmpty()) {
            return null;
        }
        return this.cards.remove(cards.size() - 1);
    }

    public int getRemainingCards() {
        return this.cards.size();
    }

}
