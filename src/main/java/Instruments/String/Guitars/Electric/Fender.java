package Instruments.String.Guitars.Electric;

public class Fender extends ElectricGuitar{

    String pickups;

    public Fender(double buyingPrice, double sellingPrice, String model, String pickups) {
        super(buyingPrice, sellingPrice, "Fender", model);
        this.pickups = pickups;

    }

    public String play() {
        return "You hear the classic bright and sharp Stratocaster tone";
    }
}
