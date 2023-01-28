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
    public void checkHasType() {

        assertEquals(InstrumentType.STRINGS,
                violin.getType());
    }

    @Test
    public void checkCanPlay() {

        assertEquals(violin.getName() + " is playing",
                violin.play());
    }
}