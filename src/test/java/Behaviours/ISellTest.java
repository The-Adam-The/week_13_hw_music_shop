package Behaviours;

import Instruments.Percussion.Drums.Snares.Mapex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ISellTest {

    Mapex mapexSledge;

    @Before
    public void before() {
        mapexSledge = new Mapex(400, 500,"Black Panther SledgeHammer", 14, "mahogany", 14);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(100, mapexSledge.calculateProfit(), 0.1);
    }
}
