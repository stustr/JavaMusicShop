public class Piano extends Instrument {
    private PianoSize size;
    public Piano(InstrumentType type, PianoSize size) {
        super(type);
        this.size = size;
    }


}
