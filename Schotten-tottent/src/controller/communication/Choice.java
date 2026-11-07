package controller.communication;

public class Choice {
    private final int id; 
    private final String value; 
    private final String description;

    public Choice(int id, String value, String description) {
        this.id = id;
        this.value = value;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}