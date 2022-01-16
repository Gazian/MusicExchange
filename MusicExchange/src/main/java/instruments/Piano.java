package instruments;

public class Piano extends Instrument{
    private PianoType pianoType;
    private int numberOfKeys;
    public Piano(String name, String material, String colour, InstrumentFamilyType instrumentFamilyType,PianoType pianoType, int numberOfKeys) {
        super(name, material, colour, instrumentFamilyType);
        this.pianoType = pianoType;
        this.numberOfKeys = numberOfKeys;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public void setPianoType(PianoType pianoType) {
        this.pianoType = pianoType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public String playSound() {
        return "Do re me fa so lah";
    }
}
