package Instruments.String;

import Instruments.Instrument;

public abstract class StringInstrument extends Instrument {

    public StringInstrument(double boughtPrice, double sellingPrice, String manufacturer, String model, String instrumentName) {
        super("string", boughtPrice, sellingPrice, manufacturer, model, instrumentName);
        }
}
