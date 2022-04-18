package Instruments.String.Guitars.Acoustic;

import Instruments.String.Guitars.Acoustic.SixString.Martin;
import Instruments.String.Guitars.Acoustic.SixString.Martin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MartinTest {

    Martin martinxm4;

    @Before
    public void before() {
        martinxm4 = new Martin(600, 700,"XM4");
    }

    @Test
    public void hasTypeOfInstrument() {
        assertEquals("string", martinxm4.getTypeOfInstrument());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(600, martinxm4.getBoughtPrice(), 0.1);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(700, martinxm4.getSellingPrice(), 0.1);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Martin", martinxm4.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("XM4", martinxm4.getModel());
    }

    @Test
    public void hasTypeOfGuitar() {
        assertEquals("acoustic", martinxm4.getTypeOfGuitar());
    }

}
