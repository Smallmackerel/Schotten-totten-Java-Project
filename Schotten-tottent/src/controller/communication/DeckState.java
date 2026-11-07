package controller.communication;

public class DeckState {

    private final String deckName;
    private final int remainingCards;

    public DeckState(String deckName, int remainingCards) {
        this.deckName = deckName;
        this.remainingCards = remainingCards;
    }

    public String getDeckName() {
        return deckName;
    }

    public int getRemainingCards() {
        return remainingCards;
    }
}