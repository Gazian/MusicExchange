package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Gibson L-00","Mahogany","Vintage Sunburst", InstrumentFamilyType.STRING,GuitarType.ACOUSTIC,6);
    }

    @Test
    public void guitarHasName() {
        assertEquals("Gibson L-00",guitar.getName());
    }

    @Test
    public void canSetGuitarName() {
        guitar.setName("Gibson Les Paul");
        assertEquals("Gibson Les Paul",guitar.getName());
    }

    @Test
    public void guitarInstrumentHasMaterial() {
        assertEquals("Mahogany",guitar.getMaterial());
    }

    @Test
    public void canSetGuitarInstrumentMaterial() {
        guitar.setMaterial("Maple");
        assertEquals("Maple",guitar.getMaterial());
    }

    @Test
    public void guitarInstrumentHasColour() {
        assertEquals("Vintage Sunburst",guitar.getColour());
    }

    @Test
    public void canSetGuitarInstrumentColour() {
        guitar.setColour("Wine Red");
        assertEquals("Wine Red",guitar.getColour());
    }

    @Test
    public void guitarInstrumentHasFamilyType() {
        assertEquals(InstrumentFamilyType.STRING,guitar.getInstrumentFamilyType());
    }

    @Test
    public void guitarInstrumentHasGuitarType() {
        assertEquals(GuitarType.ACOUSTIC,guitar.getGuitarType());
    }

    @Test
    public void canSetguitarInstrumentguitarType() {
        guitar.setGuitarType(GuitarType.ELECTRIC);
        assertEquals(GuitarType.ELECTRIC,guitar.getGuitarType());
    }

    @Test
    public void guitarInstrumentMakesSound() {
        assertEquals("Strum Strum",guitar.playSound());
    }
}
