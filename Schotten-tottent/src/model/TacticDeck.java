package model;

import java.util.ArrayList;
import java.util.List;

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
