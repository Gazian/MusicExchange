package instruments;

import instruments.Brass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {

    Brass brass;

    @Before
    public void setUp() {
        brass = new Brass("Trumpet","Metal","Gold",InstrumentFamilyType.BRASS,BrassType.VALVED);
    }

    @Test
    public void brassInstrumentHasName() {
        assertEquals("Trumpet",brass.getName());
    }

    @Test
    public void canSetBrassInstrumentName() {
        brass.setName("Tuba");
        assertEquals("Tuba",brass.getName());
    }

    @Test
    public void brassInstrumentHasMaterial() {
        assertEquals("Metal",brass.getMaterial());
    }

    @Test
    public void canSetBrassInstrumentMaterial() {
        brass.setMaterial("Nylon");
        assertEquals("Nylon",brass.getMaterial());
    }

    @Test
    public void brassInstrumentHasColour() {
        assertEquals("Gold",brass.getColour());
    }

    @Test
    public void canSetBrassInstrumentColour() {
        brass.setColour("Red");
        assertEquals("Red",brass.getColour());
    }

    @Test
    public void brassInstrumentHasFamilyType() {
        assertEquals(InstrumentFamilyType.BRASS,brass.getInstrumentFamilyType());
    }

    @Test
    public void brassInstrumentHasBrassType() {
        assertEquals(BrassType.VALVED,brass.getBrassType());
    }

    @Test
    public void canSetBrassInstrumentBrassType() {
        brass.setBrassType(BrassType.SLIDE);
        assertEquals(BrassType.SLIDE,brass.getBrassType());
    }

    @Test
    public void brassInstrumentMakesSound() {
        assertEquals("Honk Honk",brass.playSound());
    }


}