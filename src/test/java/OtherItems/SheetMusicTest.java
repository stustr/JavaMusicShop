package OtherItems;

import OtherItems.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Sheet music",
                "Britten", "Storm", 1.00, 2.00);
    }

    @Test
    public void checkName() {

        assertEquals("Sheet music", sheetMusic.getName());
    }

    @Test
    public void checkDescription() {

        assertEquals("Storm", sheetMusic.getDescription());
    }

    @Test
    public void checkComposerName() {
        assertEquals("Britten",
                sheetMusic.getComposerName());
    }

    @Test
    public void checkBuyPrice() {

        assertEquals(1.00, sheetMusic.getBuyPrice(), 0.00);
    }

    @Test
    public void checkSellPrice() {

        assertEquals(2.00, sheetMusic.getSellPrice(), 0.00);
    }

    @Test
    public void checkMarkup() {

        assertEquals(1.00, sheetMusic.calculateMarkUp(),
                0.00);
    }
}