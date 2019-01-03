import org.junit.Test;

import static org.junit.Assert.*;

public class Characteroccurencetest {

    @Test
    public void countCharOccurance() {
        Character_occurence ex1 = new Character_occurence();

        assertEquals(2, ex1.countOcc("tejaswini", "i"));

    }
}