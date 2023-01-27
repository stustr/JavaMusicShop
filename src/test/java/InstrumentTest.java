import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstrumentTest {
    Instrument instrument;

    @Before
    public void setUp() throws Exception {
//        instrument = new Instrument(InstrumentType.WOOD);
    }
    @Ignore
    @Test
    public void checkHasType() {

        assertEquals(InstrumentType.WOOD,
                instrument.getType());
    }
    @Ignore
    @Test
    public void play() {
        assertNull(instrument.play());
    }
}