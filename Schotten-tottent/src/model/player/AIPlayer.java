package model.player;

import controller.communication.GameMessage;
import controller.communication.PlayerResponse;

public class AIPlayer extends Player {

    public AIPlayer(String name, PlayerSide side) {
        super(name, side);
    }

    @Override
    public PlayerResponse receive(GameMessage gameMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receive'");
    }
}
