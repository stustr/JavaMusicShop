import behaviours.Sellable;

import java.util.HashMap;
import java.util.Map;

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

    public double getPotentialProfit() {
        double totalPotentialProfit = 0;
        for (Sellable sellable : stock.keySet()
        ) {
            System.out.println(stock.get(sellable));
            totalPotentialProfit += sellable.calculateMarkUp() * stock.get(sellable);
        }
        return totalPotentialProfit;
    }
}
