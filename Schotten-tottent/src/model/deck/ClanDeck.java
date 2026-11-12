package model.deck;

import model.card.clanCard.ClanCard;
import model.card.clanCard.Colors;

public class ClanDeck extends Deck {

    public ClanDeck() {
        super();
        initialize();
        shuffle();
    }

    protected void initialize() {
        for (int i = 1; i <= 9; i++) {
            for (Colors color : Colors.values()) {
                super.addCard(new ClanCard("Clan card " + i + " of color " + color, i, color));
            }
        }
    }
}
