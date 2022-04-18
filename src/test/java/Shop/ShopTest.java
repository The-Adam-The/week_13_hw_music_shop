package Shop;

import Instruments.Percussion.Drums.Snares.Mapex;
import Instruments.String.Guitars.Electric.Fender;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop rays;
    Mapex mapexSledge;
    Fender fenderStrat;

    @Before
    public void before() {
        rays = new Shop("Rays");
        mapexSledge = new Mapex(400, 500,"Black Panther SledgeHammer", 14, "mahogany", 14);
        fenderStrat = new Fender(800, 900,"Stratocaster97", "Seymour Duncan Singles");
    }

    @Test
    public void shopHasName() {
        assertEquals("Rays", rays.getName());
    }

    @Test
    public void canAddInstrumentsToInventory() {
        rays.addInstrumentToInventory(mapexSledge);
        rays.addInstrumentToInventory(fenderStrat);
        assertEquals(Arrays.asList(mapexSledge, fenderStrat), rays.getShopInventory());
    }

    @Test
    public void canRemoveInstrumentFromInventory() {
        rays.addInstrumentToInventory(mapexSledge);
        rays.addInstrumentToInventory(fenderStrat);
        rays.removeInstrumentFromInventory(mapexSledge);
        assertEquals(Arrays.asList(fenderStrat), rays.getShopInventory());

    }
}
