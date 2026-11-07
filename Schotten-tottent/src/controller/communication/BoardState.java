package controller.communication;

import java.util.List;
import model.Battlefield;

public class BoardState {

    private final List<Battlefield> battlefields;
    private final List<DeckState> decksState;

    public BoardState(List<Battlefield> battlefields, List<DeckState> decksState) {
        this.battlefields = battlefields;
        this.decksState = decksState;
    }

    public List<Battlefield> getBattlefields() {
        return battlefields;
    }

    public List<DeckState> getDecksState() {
        return decksState;
    }
}