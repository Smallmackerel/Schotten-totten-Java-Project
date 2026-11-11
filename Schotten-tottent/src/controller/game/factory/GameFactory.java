package controller.game.factory;

import java.util.List;

import controller.game.Game;
import controller.game.modes.ClassicGame;
import controller.game.modes.ExpertGame;
import controller.game.modes.TacticGame;
import model.player.Player;

public final class GameFactory {

    private GameFactory() {
    }

    public static Game createGame(GameMode gameMode, List<Player> players){
        switch(gameMode){
            case CLASSIC:
                return new ClassicGame(players);
            case TACTIC:
                return new TacticGame(players);
            case EXPERT:
                return new ExpertGame(players);
            default:
                throw new IllegalArgumentException("Unknown game mode: " + gameMode);
        }
    }
}