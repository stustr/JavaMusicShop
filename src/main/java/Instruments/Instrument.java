package Instruments;

abstract class Instrument implements Playable {
    private InstrumentType type;
    private String name;

    public Instrument(InstrumentType type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String play() {
        return name + " is playing";
    }

    public InstrumentType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
