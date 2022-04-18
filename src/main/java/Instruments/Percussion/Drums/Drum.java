package Instruments.Percussion.Drums;

import Instruments.Percussion.PercussionInstrument;

public abstract class Drum extends PercussionInstrument {

    private String typeOfDrum;

    public Drum(double buyingPrice, double sellingPrice, String manufacturer, String model, String typeOfDrum) {
        super(buyingPrice, sellingPrice, manufacturer, model, "drum");
        this.typeOfDrum = typeOfDrum;
    }

    public String getTypeofDrum() {
        return typeOfDrum;
    }
}
