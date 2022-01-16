package instruments;

public class Saxophone extends Instrument{

    private SaxophoneType saxophoneType;
    private String mouthpiece;

    public Saxophone(String name, String material, String colour, InstrumentFamilyType instrumentFamilyType, SaxophoneType saxophoneType, String mouthpiece) {
            super(name, material, colour, instrumentFamilyType);
            this.saxophoneType = saxophoneType;
            this.mouthpiece = mouthpiece;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public void setSaxophoneType(SaxophoneType saxophoneType) {
        this.saxophoneType = saxophoneType;
    }

    public String getMouthpiece() {
        return mouthpiece;
    }

    public void setMouthpiece(String mouthpiece) {
        this.mouthpiece = mouthpiece;
    }

    @Override
    public String playSound() {
        return "Doobie doobie doobie dooo";
    }
}
