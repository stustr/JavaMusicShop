import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {
    Shop shop;
    ArrayList<ISell> stock;
    StockItem stockItem;

    @Before
    public void setUp() throws Exception {
        stockItem = new StockItem("guitar", 19.99, 29.99);
        stock = new ArrayList<>();
        shop = new Shop(stock);
    }

    @Test
    public void checkHasStock() {

        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void checkCanAddStock() {

        stock.add(stockItem);
        assertEquals(1,shop.getStock().size());
    }

    @Test
    public void canRemoveItem() {
        stock.add(stockItem);
        stock.remove(stockItem);
        assertEquals(0,shop.getStock().size());
    }
}