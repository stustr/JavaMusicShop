package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViolinTest {
    Violin violin;

    @Before
    public void setUp() throws Exception {
        violin = new Violin(InstrumentType.STRINGS, "A " +
                "great thing", 10.00, 20.00);
    }

    @Test
    public void checkHasInstrumentType() {

        assertEquals(InstrumentType.STRINGS,
                violin.getType());
    }

    @Test
    public void checkName() {

        assertEquals("Violin", violin.getName());
    }

    @Test
    public void checkDescription() {

        assertEquals("A great thing",
                violin.getDescription());
    }

    @Test
    public void checkBuyPrice() {

        assertEquals(Double.valueOf(10),
                violin.getBuyPrice());
    }

    @Test
    public void checkSellPrice() {

        assertEquals(Double.valueOf(20),
                violin.getSellPrice());
    }

    @Test
    public void checkCanPlay() {

        assertEquals(violin.getName() + " is playing",
                violin.play());
    }

    @Test
    public void checkCanCalculateMarkup() {

        assertEquals(10, violin.calculateMarkUp(), 0.00);
    }
}