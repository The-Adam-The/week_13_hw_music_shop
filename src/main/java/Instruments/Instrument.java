package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String typeOfInstrument;
    private double boughtPrice;
    private double sellingPrice;
    private String manufacturer;
    private String model;
    private String instrumentName;

    public Instrument(String typeOfInstrument, double boughtPrice, double sellingPrice, String manufacturer, String model, String instrumentName) {
        this.typeOfInstrument = typeOfInstrument;
        this.sellingPrice = sellingPrice;
        this.boughtPrice = boughtPrice;
        this.manufacturer = manufacturer;
        this.model = model;
        this.instrumentName = instrumentName;
    }

    public String getTypeOfInstrument() {
        return typeOfInstrument;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getModel(){
        return model;
    }

    public double calculateProfit() {
        return sellingPrice - boughtPrice;
    }

}
