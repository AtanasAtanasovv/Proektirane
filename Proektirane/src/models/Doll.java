package models;

public class Doll extends Toy{

    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Doll(String gender) {
        this.gender = gender;
    }
}
