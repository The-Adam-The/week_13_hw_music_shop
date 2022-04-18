package Instruments.String.Guitars;

import Instruments.Instrument;
import Instruments.String.StringInstrument;

public abstract class Guitar extends StringInstrument {

    private String typeOfGuitar;


    public Guitar(double buyingPrice, double sellingPrice, String manufacturer, String model, String typeOfGuitar) {
        super(buyingPrice, sellingPrice, manufacturer, model, "guitar");
        this.typeOfGuitar = typeOfGuitar;
    }

    public String getTypeOfGuitar() {
        return typeOfGuitar;
    }
}
