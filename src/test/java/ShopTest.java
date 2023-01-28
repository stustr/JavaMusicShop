import OtherItems.SheetMusic;
import behaviours.Sellable;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ShopTest {
    Shop shop;
    HashMap<Sellable, Integer> stock;
    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("Sheet music",
                "Britten",
                "Storm", 1.00
                , 2.00);
        stock = new HashMap<>();
        shop = new Shop(stock);
    }

    @Test
    public void checkHasStock() {

        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void checkCanAddStock() {

        shop.addStock(sheetMusic,1);
        shop.addStock(sheetMusic,1);
        assertEquals((Integer) 2,
                shop.getStock().get(sheetMusic));
    }

    @Test
    public void canRemoveItem() {
        stock.put(sheetMusic, 1);
        stock.remove(sheetMusic);
        assertEquals(0, shop.getStock().size());
    }
}