import java.util.HashMap;

public class Shop {
    private HashMap<Sellable, Integer> stock;

    public Shop(HashMap<Sellable, Integer> stock) {
        this.stock = stock;
    }

    public HashMap<Sellable, Integer> getStock() {
        return stock;
    }

    public void addStock(Sellable sellable,
                         Integer quantity) {
        stock.put(sellable, stock.getOrDefault(sellable,
                0) + quantity);
    }
}
