public class StockItem implements ISell {
    private String description;
    private Double buyPrice;
    private Double sellPrice;

    public StockItem(String description, Double buyPrice,
                     Double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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
