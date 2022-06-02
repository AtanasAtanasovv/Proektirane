package models;

import java.time.Instant;
import java.util.Random;

public class ToyFactory extends Factory {

    public Bike createBike() {
        Random random=new Random();
        int decider=random.nextInt()%2;

        if (decider==0){
            return new Bike("red");
        }
        else return new Bike("blue");
    }

    public Doll createDoll() {
        Random random=new Random();
        int decider=Math.abs(random.nextInt()%3);
        Doll doll;
          switch (decider){
            case 0: doll = new Doll("boy"); break;
            case 1: doll = new Doll("girl"); break;
            case 2: doll = new Doll("apache helicopter");break;
            default: doll = new Doll("trans");
        };

        return doll;
    }
}
