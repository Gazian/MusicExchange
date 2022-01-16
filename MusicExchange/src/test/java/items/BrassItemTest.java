package items;

import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassItemTest {

    BrassItem brassItem;
    Brass brass;
    Brass brass1;


    @Before
    public void setUp() {
        brass = new Brass("Yamaha YTR-2330 Bb Trumpet","Metal","Gold",InstrumentFamilyType.BRASS, BrassType.VALVED);
        brassItem = new BrassItem(ItemType.INSTRUMENT,275.00,350.00,brass);
    }

    @Test
    public void getBrassItemItemType(){
        assertEquals(ItemType.INSTRUMENT,brassItem.getItemType());
    }

    @Test
    public void canGetBrassItem(){
        assertEquals(brass, brassItem.getBrass());
    }

    @Test
    public void CanSetBrassItem(){
        brass1 = new Brass("Tuba","Metal", "Gold",InstrumentFamilyType.BRASS,BrassType.VALVED);
        brassItem.setBrass(brass1);
        assertEquals(brass1, brassItem.getBrass());
    }

    @Test
    public void getBrassItemPurchasePrice(){
        assertEquals(275.00,brassItem.getPurchasePrice(),0.0);
    }

    @Test
    public void cnSetBrassItemPurchasePrice(){
        brassItem.setPurchasePrice(299.99);
        assertEquals(299.99,brassItem.getPurchasePrice(),0.0);
    }

    @Test
    public void getBrassItemSalePrice(){
        assertEquals(350.00,brassItem.getSalePrice(),0.0);
    }

    @Test
    public void cnSetBrassItemSalePrice(){
        brassItem.setSalePrice(1049.50);
        assertEquals(1049.50,brassItem.getSalePrice(),0.0);
    }


    @Test
    public void calculateBrassItemMarkup(){
        assertEquals(75.00,brassItem.calculateMarkup(),0.0);
    }



}
