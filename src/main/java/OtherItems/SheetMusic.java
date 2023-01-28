package OtherItems;

public class SheetMusic extends StockItem {

    public String composerName;

    public SheetMusic(String name, String composerName,
                      String description, Double buyPrice
            , Double sellPrice) {
        super(name, description, buyPrice, sellPrice);
        this.composerName = composerName;
    }

    public String getComposerName() {
        return this.composerName;
    }
}
