abstract class Instrument implements Playable {
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
