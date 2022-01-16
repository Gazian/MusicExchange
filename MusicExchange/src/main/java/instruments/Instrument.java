package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {
    private String name;
    private String material;
    private String colour;
    private InstrumentFamilyType instrumentFamilyType;

    public Instrument(String name, String material, String colour, InstrumentFamilyType instrumentFamilyType) {
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.instrumentFamilyType = instrumentFamilyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentFamilyType getInstrumentFamilyType() {
        return instrumentFamilyType;
    }


    public void setInstrumentFamilyType(InstrumentFamilyType instrumentFamilyType) {
        this.instrumentFamilyType = instrumentFamilyType;
    }
}
