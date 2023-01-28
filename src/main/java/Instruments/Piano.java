package Instruments;

public class Piano extends Instrument {
    private static final String name = "Piano";
    private PianoSize size;
    public Piano(InstrumentType type, PianoSize size) {
        super(type, name);
        this.size = size;
    }
    public PianoSize getSize() {
        return size;
    }
}
