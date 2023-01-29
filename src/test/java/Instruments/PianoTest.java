package Instruments;

import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.PianoSize;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {
    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(InstrumentType.PERCUSSION, "A " +
                "great item", 19.99, 29.99,
                PianoSize.BABY_GRAND);
    }

    @Test
    public void checkHasInstrumentType() {

        assertEquals(InstrumentType.PERCUSSION,
                piano.getType());
    }

    @Test
    public void checkName() {

        assertEquals("Piano", piano.getName());
    }

    @Test
    public void checkDescription() {

        assertEquals("A great item", piano.getDescription());
    }

    @Test
    public void checkBuyPrice() {

        assertEquals(Double.valueOf(19.99), piano.getBuyPrice());
    }

    @Test
    public void checkSellPrice() {

        assertEquals(Double.valueOf(29.99), piano.getSellPrice());
    }

    @Test
    public void checkHasSize() {

        assertEquals(PianoSize.BABY_GRAND, piano.getSize());
    }

    @Test
    public void checkCanPlay() {

        assertEquals(piano.getName() + " is playing",
                piano.play());
    }

    @Test
    public void checkCanCalculateMarkup() {

        assertEquals(10, piano.calculateMarkUp(), 0.00);
    }
}