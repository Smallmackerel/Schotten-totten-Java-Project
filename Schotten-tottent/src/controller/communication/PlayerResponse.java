package controller.communication;

public class PlayerResponse {

    private final ResponseType type;
    private final Choice choice;

    public PlayerResponse(ResponseType type, Choice choice){
        this.type = type;
        this.choice = choice;
    }

    public ResponseType getType() {
        return type;
    }

    public Choice getChoice() {
        return choice;
    }
}
