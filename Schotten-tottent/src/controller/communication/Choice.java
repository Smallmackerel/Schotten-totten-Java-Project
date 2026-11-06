package controller.communication;

public class Choice {
    private int id; 
    private String value; 
    private String description;

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