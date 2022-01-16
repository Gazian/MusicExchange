package items;
import shop.Shop;
import instruments.Brass;
import instruments.BrassType;
import instruments.InstrumentFamilyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    BrassItem brassItem;
    AccessoryItem accessoryItem;
    Brass brass;
    Shop shop;

    @Before
    public void setUp(){
        shop = new Shop("Ray's Music Exchange");
        brass = new Brass("Trumpet","Metal","Gold", InstrumentFamilyType.BRASS, BrassType.VALVED);
        brassItem = new BrassItem(ItemType.INSTRUMENT,275.00,350.00,brass);
        accessoryItem = new AccessoryItem("Drum Sticks",ItemType.ACCESSORY,7.99,15.00);
    }

    @Test
    public void shopHasName(){
        assertEquals("Ray's Music Exchange",shop.getShopName());
    }

    @Test
    public void stockListStartsEmpty(){
        assertEquals(0,shop.getStockList().size());
    }

    @Test
    public void shopCanAddBrassStockItem(){
        shop.addItemOfStock(brassItem);
        assertEquals(1,shop.getStockList().size());
    }

    @Test
    public void shopCanAddAccessoryStockItem(){
        shop.addItemOfStock(accessoryItem);
        assertEquals(1,shop.getStockList().size());
    }

    @Test
    public void shopCanAddMultipleStockItems(){
        shop.addItemOfStock(accessoryItem);
        shop.addItemOfStock(brassItem);
        assertEquals(2,shop.getStockList().size());
    }

    @Test
    public void shopCanRemoveStockItem(){
        shop.addItemOfStock(accessoryItem);
        shop.addItemOfStock(brassItem);
        shop.removeItemOfStock(accessoryItem);
        assertEquals(1,shop.getStockList().size());
    }

    @Test
    public void shopCanCalculateTotalProfit(){
        shop.addItemOfStock(accessoryItem);
        shop.addItemOfStock(brassItem);
        assertEquals(82.01,shop.getTotalStockProfit(),0.0);
    }


}
