package models;

public class Bike extends Toy {

    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Bike(String colour) {
        this.colour = colour;
    }
}
