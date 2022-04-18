package Instruments.String.Guitars.Electric;

import Instruments.String.Guitars.Guitar;

public abstract class ElectricGuitar extends Guitar {

    public ElectricGuitar( double buyingPrice, double sellingPrice, String manufacturer, String model) {
        super(buyingPrice, sellingPrice, manufacturer, model, "electric");

    }


}
