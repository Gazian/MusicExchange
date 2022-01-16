package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryItemTest {

    AccessoryItem accessoryItem;

    @Before
    public void setUp(){
        accessoryItem = new AccessoryItem("Drum Sticks",ItemType.ACCESSORY,15,20);
    }

    @Test
    public void accessoryItemHasName(){
        assertEquals("Drum Sticks",accessoryItem.getName());
    }

    @Test
    public void canSetAccessoryItemHasName(){
        accessoryItem.setName("Guitar Strings");
        assertEquals("Guitar Strings",accessoryItem.getName());
    }

    @Test
    public void accessoryItemHasItemType(){
        assertEquals(ItemType.ACCESSORY,accessoryItem.getItemType());
    }

    @Test
    public void accessoryItemHasPurchasePrice(){
        assertEquals(15,accessoryItem.getPurchasePrice(),0.0);
    }

    @Test
    public void accessoryItemCanSetPurchasePrice(){
        accessoryItem.setPurchasePrice(7.99);
        assertEquals(7.99,accessoryItem.getPurchasePrice(),0.0);
    }

    @Test
    public void accessoryItemHasSalePrice(){
        assertEquals(20,accessoryItem.getSalePrice(),0.0);
    }

    @Test
    public void accessoryItemCanSetSalePrice(){
        accessoryItem.setSalePrice(12.50);
        assertEquals(12.50,accessoryItem.getSalePrice(),0.0);
    }

    @Test
    public void calculateAccessoryItemMarkup(){
        assertEquals(5.00,accessoryItem.calculateMarkup(),0.0);
    }


}
