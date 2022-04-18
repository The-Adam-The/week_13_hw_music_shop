package Shop;

import Behaviours.ISell;
import Instruments.Percussion.Drums.Snares.Mapex;
import Instruments.String.Guitars.Electric.Fender;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private String name;
    private ArrayList<ISell> inventory;

    public Shop(String name){
        this.name = name;
        this.inventory = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getShopInventory() {
        return inventory;
    }

    public void addInstrumentToInventory(ISell item) {
        inventory.add(item);
    }

    public void removeInstrumentFromInventory(ISell item) {
        for (ISell element : inventory) {
            if( element.equals(item)) {
                inventory.remove(item);
            }
        }
    }
}
