package models;

import java.util.Observable;

public class Board extends Observable {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        setChanged();
        notifyObservers(text);
    }

    public Board(String text) {
        this.text = text;
    }
}
