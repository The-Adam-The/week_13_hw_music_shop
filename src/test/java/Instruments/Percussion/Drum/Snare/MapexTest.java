package Instruments.Percussion.Drum.Snare;

import Instruments.Percussion.Drums.Snares.Mapex;
import Instruments.String.Guitars.Electric.Fender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapexTest {

    Mapex mapexSledge;

    @Before
    public void before() {
        mapexSledge = new Mapex(400, 500,"Black Panther SledgeHammer", 14, "mahogany", 14);
    }

    @Test
    public void hasTypeOfInstrument() {
        assertEquals("percussion", mapexSledge.getTypeOfInstrument());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(400, mapexSledge.getBoughtPrice(), 0.1);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(500, mapexSledge.getSellingPrice(), 0.1);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Mapex", mapexSledge.getManufacturer());
    }

    @Test
    public void hasModel(){
        assertEquals("Black Panther SledgeHammer", mapexSledge.getModel());
    }

    @Test
    public void hasTypeOfDrum() {
        assertEquals("snare", mapexSledge.getTypeofDrum());
    }

    @Test
    public void hasDrumDiameter() {
        assertEquals(14, mapexSledge.getDrumDiameter(),0.1);
    }

    @Test
    public void hasWoodType() {
        assertEquals("mahogany", mapexSledge.getWoodType());
    }

    @Test
    public void hasNumOfLugs() {
        assertEquals(14, mapexSledge.getNumOfLugs());
    }
}
