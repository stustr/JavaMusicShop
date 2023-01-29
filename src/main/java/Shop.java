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

    public void removeStock(Sellable sellable,
                            int quantity) {
        if (this.stock.get(sellable) > quantity) {
            stock.put(sellable,
                    stock.get(sellable) - quantity);
        } else if (this.stock.get(sellable) == quantity) {
            stock.remove(sellable);
        }
    }

    public int getItemQuantity(Sellable itemToFind) {
        return stock.get(itemToFind);
    }

    public double getPotentialProfit() {
        double totalPotentialProfit = 0.00;
        for (Sellable sellable : stock.keySet()) {
            System.out.println(stock.get(sellable));
            totalPotentialProfit += sellable.calculateMarkUp() * stock.get(sellable);
        }
        return totalPotentialProfit;
    }
}
