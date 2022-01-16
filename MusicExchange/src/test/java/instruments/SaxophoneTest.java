package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("Yanagisawa T-W030 Elite","Bronze","Silver",InstrumentFamilyType.WOODWIND,SaxophoneType.TENOR,"Reed");
    }

    @Test
    public void saxophoneHasName() {
        assertEquals("Yanagisawa T-W030 Elite",saxophone.getName());
    }

    @Test
    public void canSetSaxophoneName() {
        saxophone.setName("Yamaha YAS-62S");
        assertEquals("Yamaha YAS-62S",saxophone.getName());
    }

    @Test
    public void saxophoneInstrumentHasMaterial() {
        assertEquals("Bronze",saxophone.getMaterial());
    }

    @Test
    public void canSetSaxophoneInstrumentMaterial() {
        saxophone.setMaterial("Silver");
        assertEquals("Silver",saxophone.getMaterial());
    }

    @Test
    public void saxophoneInstrumentHasColour() {
        assertEquals("Silver",saxophone.getColour());
    }

    @Test
    public void canSetSaxophoneInstrumentColour() {
        saxophone.setColour("Bronze");
        assertEquals("Bronze",saxophone.getColour());
    }

    @Test
    public void saxophoneInstrumentHasFamilyType() {
        assertEquals(InstrumentFamilyType.WOODWIND,saxophone.getInstrumentFamilyType());
    }

    @Test
    public void saxophoneInstrumentHasSaxophoneType() {
        assertEquals(SaxophoneType.TENOR,saxophone.getSaxophoneType());
    }

    @Test
    public void canSetSaxophoneInstrumentsaxophoneType() {
        saxophone.setSaxophoneType(SaxophoneType.ALTO);
        assertEquals(SaxophoneType.ALTO,saxophone.getSaxophoneType());
    }

    @Test
    public void saxophoneInstrumentMakesSound() {
        assertEquals("Doobie doobie doobie dooo",saxophone.playSound());
    }

    @Test
    public void canGetMouthpiece() {
        assertEquals("Reed",saxophone.getMouthpiece());
    }

    @Test
    public void canSetMouthpiece() {
        saxophone.setMouthpiece("Plastic");
        assertEquals("Plastic",saxophone.getMouthpiece());
    }
}
