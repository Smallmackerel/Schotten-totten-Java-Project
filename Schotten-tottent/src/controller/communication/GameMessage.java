package controller.communication;

import java.util.List;

import model.Carte;

public class GameMessage {

    // Static ID counters
    private static int lastRequestId = 1;
    private static int lastWorkflowId = 1;

    // Identification
    private int requestId;
    private int workflowId;

    // Type and content
    private MessageType type;
    private String description;
    private String errorMessage;

    // Game State
    private BoardState boardState;
    private String boardDisplay;
    private List<Carte> playerHand;

    // Possible choices
    private List<Choice> possibleChoices;

    public GameMessage(
        MessageType type,
        String description,
        BoardState boardState,
        String boardDisplay,
        List<Carte> playerHand,
        List<Choice> possibleChoices
    )
    {
        this.requestId = lastRequestId++;
        this.workflowId = lastWorkflowId;
        this.type = type;
        this.description = description;
        this.errorMessage = null;
        this.boardState = boardState;
        this.boardDisplay = boardDisplay;
        this.playerHand = playerHand;
        this.possibleChoices = possibleChoices;
    }

    public static void incrementWorkflowId(){
        lastWorkflowId++;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getBoardDisplay() {
        return boardDisplay;
    }

    public void setBoardDisplay(String boardDisplay) {
        this.boardDisplay = boardDisplay;
    }

    public List<Carte> getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(List<Carte> playerHand) {
        this.playerHand = playerHand;
    }

    public List<Choice> getPossibleChoices() {
        return possibleChoices;
    }

    public void setPossibleChoices(List<Choice> possibleChoices) {
        this.possibleChoices = possibleChoices;
    }

    


}