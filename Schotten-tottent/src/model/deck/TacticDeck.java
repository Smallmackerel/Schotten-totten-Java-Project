package model.deck;

import java.util.ArrayList;
import java.util.List;

import model.card.clanCard.ClanCard;
import model.card.tacticCard.TacticCard;

public class TacticDeck extends Deck {

    private List<TacticCard> tacticCards = new ArrayList<>();
    private List<ClanCard> clanCards = new ArrayList<>();

    public List<TacticCard> getTacticCards() {
        return tacticCards;
    }

    public void setTacticCards(List<TacticCard> tacticCards) {
        this.tacticCards = tacticCards;
    }

    public List<ClanCard> getClanCards() {
        return clanCards;
    }

    public void setClanCards(List<ClanCard> clanCards) {
        this.clanCards = clanCards;
    }
}
