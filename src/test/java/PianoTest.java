import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {
    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(InstrumentType.PERCUSSION,
                PianoSize.BABY_GRAND);
    }

    @Test
    public void checkHasInstrumentType() {

        assertEquals(InstrumentType.PERCUSSION,
                piano.getType());
    }

    @Test
    public void checkHasSize() {

        assertEquals(PianoSize.BABY_GRAND, piano.getSize());
    }

    @Test
    public void checkCanPlay() {

        assertEquals("Plinky plonk", piano.play());
    }
}