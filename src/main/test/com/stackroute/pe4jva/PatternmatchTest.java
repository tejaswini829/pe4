import org.junit.Test;

import static org.junit.Assert.*;

public class PatternmatchTest {

    @Test
    public void findMatch() {
        Patternmatch check = new Patternmatch();
        assertEquals("Found at : 4-6\nFound at : 10-12\nFound at : 27-29\n",check.findMatch("se","She sells seashells by the seashore"));
    }
}