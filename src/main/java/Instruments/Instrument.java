package Instruments;

import behaviours.Sellable;

abstract class Instrument implements Playable, Sellable {
    private InstrumentType type;
    private String name;
    private String description;
    private Double buyPrice;
    private Double sellPrice;

    public Instrument(InstrumentType type, String name,
                      String description, Double buyPrice, Double sellPrice) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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

    public String getDescription() {
        return description;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public Double calculateMarkUp() {
        return sellPrice - buyPrice;
    }
}
