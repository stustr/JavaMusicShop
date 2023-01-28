package Instruments;

public class Piano extends Instrument {
    private static final String name = "Piano";
    private String description;
    private Double sellPrice;
    private Double buyPrice;
    private PianoSize size;

    public Piano(InstrumentType type,
                 String description,
                 Double buyPrice, Double sellPrice,
                 PianoSize size) {
        super(type,
                name,
                description,
                buyPrice,
                sellPrice);
        this.size = size;
    }

    public PianoSize getSize() {
        return size;
    }
}
