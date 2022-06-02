package models;

import java.util.ArrayList;
import java.util.List;

public class Santa {
    private ToyFactory toyFactory;
    private List<Dwarf> dwarves;
    private Board board;

    private static Santa uniqueInstance = new Santa();

    public static Santa getInstance(){
        return uniqueInstance;
    }
    private Santa(){
        this.toyFactory=new ToyFactory();
        this.dwarves=new ArrayList<>();
        this.dwarves.add(new Dwarf("Ivan"));
        this.dwarves.add(new Dwarf("Asen"));
        this.dwarves.add(new Dwarf("Georgi"));
        this.board=new Board("empty");
        for (Dwarf dwarf : dwarves) {
            this.board.addObserver(dwarf);
        }
    }
    public void changeBoardText(String text){
        this.board.setText(text);
    }
}
