package Instruments.String.Guitars.Electric;

import Instruments.String.Guitars.Acoustic.SixString.Martin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FenderTest {

    Fender fenderStrat;

    @Before
    public void before() {
        fenderStrat = new Fender(800, 900,"Stratocaster97", "Seymour Duncan Singles");
    }

    @Test
    public void hasTypeOfInstrument() {
        assertEquals("string", fenderStrat.getTypeOfInstrument());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(800, fenderStrat.getBoughtPrice(), 0.1);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(900, fenderStrat.getSellingPrice(), 0.1);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Fender", fenderStrat.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("Stratocaster97", fenderStrat.getModel());
    }

    @Test
    public void hasTypeOfGuitar() {
        assertEquals("electric", fenderStrat.getTypeOfGuitar());
    }

}
