import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstrumentTest {
    Instrument instrument;

    @Before
    public void setUp() throws Exception {
        instrument = new Instrument(InstrumentType.WOOD);
    }

    @Test
    public void checkHasType() {

        assertEquals(InstrumentType.WOOD,
                instrument.getType());
    }

    @Test
    public void play() {
        assertNull(instrument.play());
    }
}