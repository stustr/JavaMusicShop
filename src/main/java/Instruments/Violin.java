package Instruments;

public class Violin extends Instrument {

    private static final String name = "Violin";
    private String description;
    private Double buyPrice;
    private Double sellPrice;

    public Violin(InstrumentType type, String description
            , Double buyPrice, Double sellPrice) {
        super(type, name, description, buyPrice, sellPrice);
    }
}
