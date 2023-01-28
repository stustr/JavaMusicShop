import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.junit.Assert.*;

public class ShopTest {
    Shop shop;
    HashMap<Sellable, Integer> stock;
    StockItem stockItem;

    @Before
    public void setUp() throws Exception {
        stockItem = new StockItem("guitar", 19.99, 29.99);
        stock = new HashMap<>();
        shop = new Shop(stock);
    }

    @Test
    public void checkHasStock() {

        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void checkCanAddStock() {

        shop.addStock(stockItem,1);
        shop.addStock(stockItem,1);
        assertEquals((Integer) 2,
                shop.getStock().get(stockItem));
    }

    @Test
    public void canRemoveItem() {
        stock.put(stockItem, 1);
        stock.remove(stockItem);
        assertEquals(0, shop.getStock().size());
    }
}