package Instruments.Percussion.Drums.Snares;

import Instruments.Percussion.Drums.Drum;

public abstract class Snare extends Drum {


    private double drumDiameter;
    private String woodType;
    private int numOfLugs;

    public Snare(double buyingPrice, double sellingPrice, String manufacturer, String model, double drumDiameter, String woodType, int numOfLugs) {
        super(buyingPrice, sellingPrice, manufacturer, model, "snare");
        this.drumDiameter = drumDiameter;
        this.woodType = woodType;
        this.numOfLugs = numOfLugs;


    }

    public double getDrumDiameter() {
        return drumDiameter;
    }

    public String getWoodType() {
        return woodType;
    }

    public int getNumOfLugs() {
        return numOfLugs;
    }
}
