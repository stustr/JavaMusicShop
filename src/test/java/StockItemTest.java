import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StockItemTest {
    StockItem stockItem;

    @Before
    public void before() {
        stockItem = new StockItem("guitar", 19.99, 29.99);
    }

    @Test
    public void checkHasDescription() {

        assertEquals("guitar", stockItem.getDescription());
    }

    @Test
    public void checkHasBuyPrice() {

        assertEquals(19.99, stockItem.getBuyPrice());
    }

    @Test
    public void checkHasSellPrice() {

        assertEquals(29.99, stockItem.getSellPrice());
    }

    @Test
    public void checkCanMarkup() {

        assertEquals(10, stockItem.calculateMarkUp());
    }
}