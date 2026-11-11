package controller.game;

import java.util.ArrayList;
import java.util.List;
import model.Battlefield;
import model.player.Player;

public abstract class Game {

    protected List<Battlefield> battlefields;
    protected List<Player> players;

    public Game(List<Player> players){
        this.players = players;
        this.battlefields = new ArrayList<>();
    }

    public abstract void play();
}
