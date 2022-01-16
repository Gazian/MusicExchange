package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Seiler 186 Maestro","Hard Maple","Black",InstrumentFamilyType.KEYBOARD,PianoType.GRAND,88);
    }

    @Test
    public void pianoHasName() {
        assertEquals("Seiler 186 Maestro",piano.getName());
    }

    @Test
    public void canSetPianoName() {
        piano.setName("Yamaha Clavinova");
        assertEquals("Yamaha Clavinova",piano.getName());
    }

    @Test
    public void pianoInstrumentHasMaterial() {
        assertEquals("Hard Maple",piano.getMaterial());
    }

    @Test
    public void canSetPianoInstrumentMaterial() {
        piano.setMaterial("Synthetic Ebony");
        assertEquals("Synthetic Ebony",piano.getMaterial());
    }

    @Test
    public void pianoInstrumentHasColour() {
        assertEquals("Black",piano.getColour());
    }

    @Test
    public void canSetPianoInstrumentColour() {
        piano.setColour("White");
        assertEquals("White",piano.getColour());
    }

    @Test
    public void pianoInstrumentHasFamilyType() {
        assertEquals(InstrumentFamilyType.KEYBOARD,piano.getInstrumentFamilyType());
    }

    @Test
    public void pianoInstrumentHasPianoType() {
        assertEquals(PianoType.GRAND,piano.getPianoType());
    }

    @Test
    public void canSetPianoInstrumentpianoType() {
        piano.setPianoType(PianoType.ELECTRIC);
        assertEquals(PianoType.ELECTRIC,piano.getPianoType());
    }

    @Test
    public void pianoInstrumentMakesSound() {
        assertEquals("Do re me fa so lah",piano.playSound());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(88,piano.getNumberOfKeys());
    }

    @Test
    public void canSetNumberOfKeys() {
        piano.setNumberOfKeys(50);
        assertEquals(50,piano.getNumberOfKeys());
    }
}
