import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.PianoSize;
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
    Piano piano;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("Sheet music",
                "Britten",
                "Storm", 1.00
                , 2.00);
        piano = new Piano(InstrumentType.PERCUSSION, "A " +
                "great piano", 200.00, 400.00,
                PianoSize.GRAND);
        stock = new HashMap<>();
        shop = new Shop(stock);
    }

    @Test
    public void checkStock() {

        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void checkAddStock() {

        shop.addStock(sheetMusic,1);
        shop.addStock(sheetMusic,1);
        assertEquals((Integer) 2,
                shop.getStock().get(sheetMusic));
    }

    @Test
    public void checkRemoveItem() {
        shop.addStock(sheetMusic, 1);
        shop.removeStock(sheetMusic, 1);
        assertEquals(0, shop.getStock().size());
        shop.addStock(sheetMusic, 3);
        shop.removeStock(sheetMusic, 5);
        assertEquals(3, shop.getItemQuantity(sheetMusic));
        shop.addStock(sheetMusic, 2);
        shop.removeStock(sheetMusic, 1);
        assertEquals(4, shop.getItemQuantity(sheetMusic));
    }

    @Test
    public void checkPotentialProfit() {
        shop.addStock(sheetMusic, 1);
        shop.addStock(sheetMusic, 2);
        shop.addStock(piano, 1);
        assertEquals(203.0, shop.getPotentialProfit(),
                0.00);
    }
}