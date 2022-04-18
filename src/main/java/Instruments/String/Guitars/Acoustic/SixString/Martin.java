package Instruments.String.Guitars.Acoustic.SixString;

import Instruments.String.Guitars.Acoustic.AcousticGuitar;

public class Martin extends AcousticGuitar {

    int numOfStrings;
    String model;


    public Martin(double buyingPrice, double sellingPrice, String model) {
        super(buyingPrice, sellingPrice, "Martin", model);
        this.numOfStrings = 6;
    }

    public String play() {
        return "Bright Acoustic Sound";
    }
}
