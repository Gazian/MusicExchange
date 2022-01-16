package instruments;

public class Guitar extends Instrument{

    private GuitarType guitarType;
    private int numberOfStrings;
    public Guitar(String name, String material, String colour, InstrumentFamilyType instrumentFamilyType,GuitarType guitarType, int numberOfStrings) {
        super(name, material, colour, instrumentFamilyType);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String playSound() {
        return "Strum Strum";
    }
}
