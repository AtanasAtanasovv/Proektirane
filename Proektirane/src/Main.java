import models.Santa;

public class Main {
    public static void main(String[] args) {
        Santa santa=Santa.getInstance();
        santa.changeBoardText("I need dolls");
        santa.changeBoardText("I need dolls");
        santa.changeBoardText("I need bikes");
        santa.changeBoardText("I need bikes");
        santa.changeBoardText("I need dolls");
        }
    }

