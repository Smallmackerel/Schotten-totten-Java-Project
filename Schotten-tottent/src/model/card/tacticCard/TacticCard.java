package model.card.tacticCard;

import model.card.Card;

public class TacticCard extends Card {

    private String name;

    public TacticCard(String description, String name) {
        super(description);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
