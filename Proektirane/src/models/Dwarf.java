package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Dwarf implements Observer,MyTask {
    private String name;
    private List<Toy> madeToys;
    private ToyFactory factory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dwarf(String name) {
        this.name = name;
        this.madeToys=new ArrayList<Toy>();
        this.factory=new ToyFactory();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String){
            performTask ((String) arg);
        }
    }

    @Override
    public void performTask(String text) {
        if (text.equals("I need dolls")) {
            Doll doll = factory.createDoll();
            madeToys.add(doll);
            System.out.println(name+" has created a "+ doll.getGender() +  " doll");
        }
        if (text.equals("I need bikes")){
            Bike bike = factory.createBike();
            madeToys.add(bike);
            System.out.println(name+" has created a " +bike.getColour()+" bike");
        }
    }
}
