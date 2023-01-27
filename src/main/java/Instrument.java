abstract class Instrument implements IPlay {
    private InstrumentType type;

    public Instrument(InstrumentType type) {
        this.type = type;
    }

    @Override
    public String play() {
        return null;
    }

    public InstrumentType getType() {
        return type;
    }
}
