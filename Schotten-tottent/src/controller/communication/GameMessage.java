package controller.communication;

import java.util.List;

import model.card.Card;

public class GameMessage {

    // Static ID counters
    private static int nextRequestId = 1;
    private static int currentWorkflowId = 1;

    // Identification
    private final int requestId;
    private final int workflowId;

    // Type and content
    private final MessageType type;
    private final String description;
    private String errorMessage;

    // Game State
    private final BoardState boardState;
    private final String boardDisplay;
    private final List<Card> playerHand;

    // Possible choices
    private final List<Choice> possibleChoices;

    public GameMessage(
        MessageType type,
        String description,
        BoardState boardState,
        String boardDisplay,
        List<Card> playerHand,
        List<Choice> possibleChoices
    )
    {
        this.requestId = nextRequestId++;
        this.workflowId = currentWorkflowId;
        this.type = type;
        this.description = description;
        this.errorMessage = null;
        this.boardState = boardState;
        this.boardDisplay = boardDisplay;
        this.playerHand = playerHand;
        this.possibleChoices = possibleChoices;
    }

    public static void incrementWorkflowId(){
        currentWorkflowId++;
    }

    public MessageType getType() {
        return type;
    }

    public String getDescription() {
        return description;
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

    public List<Card> getPlayerHand() {
        return playerHand;
    }

    public List<Choice> getPossibleChoices() {
        return possibleChoices;
    }

    public int getRequestId() {
        return requestId;
    }

    public int getWorkflowId() {
        return workflowId;
    }

    public BoardState getBoardState() {
        return boardState;
    }

}