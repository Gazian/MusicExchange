package instruments;

import behaviours.IPlay;

public class Brass extends Instrument implements IPlay {
    private BrassType brassType;

    public Brass(String name, String material, String colour, InstrumentFamilyType instrumentFamilyType, BrassType brassType) {
        super(name, material, colour, instrumentFamilyType);
        this.brassType = brassType;
    }


    public BrassType getBrassType() {
        return this.brassType;
    }

    public void setBrassType(BrassType brassType) {
        this.brassType = brassType;
    }

    @Override
    public String playSound() {
        return "Honk Honk";
    }
}
