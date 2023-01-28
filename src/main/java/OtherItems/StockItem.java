package OtherItems;

import behaviours.Sellable;

abstract class StockItem implements Sellable {
    private String name;
    private String description;
    private Double buyPrice;
    private Double sellPrice;

    public StockItem(String name, String description,
                     Double buyPrice,
                     Double sellPrice) {
        this.name = name;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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

    @Override
    public Double calculateMarkUp() {
        return sellPrice - buyPrice;
    }
}
