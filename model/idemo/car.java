package model.idemo;

public class car extends Vehicle {

    private String type;

    public car(int x, int y, String make, double price, String type) {
        super(x, y, make, price);
        this.type = type;     
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[car] "+ super.toString() + ", type =" + type;
    }

    @Override
    public String getSound() {
        return "[car] vrrrr ~~~~ oooooooo m";
    }
}
