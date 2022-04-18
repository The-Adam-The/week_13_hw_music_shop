package Instruments.Percussion.Drums.Snares;

public class Mapex extends Snare {

    public Mapex(double buyingPrice, double sellingPrice, String model, double drumDiameter, String woodType, int numOfLugs){
        super(buyingPrice, sellingPrice, "Mapex", model, drumDiameter, woodType, numOfLugs );
    }

    public String play() {
        return "The snare makes a loud crack";
    }

}
