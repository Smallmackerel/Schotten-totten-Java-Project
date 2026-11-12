package model.card.clanCard;

import model.card.Card;

public class ClanCard extends Card {

    private int value;
    private Colors color;

    public ClanCard(String description, int value, Colors color) {
        super(description);
        this.value = value;
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
