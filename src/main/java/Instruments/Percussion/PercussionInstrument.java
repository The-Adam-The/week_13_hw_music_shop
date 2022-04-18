package Instruments.Percussion;

import Instruments.Instrument;

public abstract class PercussionInstrument extends Instrument {

    public PercussionInstrument(double boughtPrice, double sellingPrice, String manufacturer, String model, String instrumentName) {
        super("percussion", boughtPrice, sellingPrice, manufacturer, model, instrumentName);
    }
}