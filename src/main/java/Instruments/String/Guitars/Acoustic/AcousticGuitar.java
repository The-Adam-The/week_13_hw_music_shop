package Instruments.String.Guitars.Acoustic;

import Instruments.String.Guitars.Guitar;

public abstract class AcousticGuitar extends Guitar {

    public AcousticGuitar(double buyingPrice, double sellingPrice, String manufacturer, String model) {
        super(buyingPrice, sellingPrice, manufacturer, model,"acoustic");
    }
}
