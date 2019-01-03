import org.junit.Test;

import static org.junit.Assert.*;

public class HarrycheckTest {

    @Test
    public void isHarryHere() {
        Harrycheck check= new Harrycheck();
        assertEquals("Is Harry here ? "+true,check.isHarryHere("I am Harry"));

    }
}