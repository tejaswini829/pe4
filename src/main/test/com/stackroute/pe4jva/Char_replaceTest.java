import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CharreplaceTest {


    @Test
    public void countString() {
        Char_replace ex2 = new Char_replace();
        String  str = "one one -one___two,,three,one @three*one?two";
        Map<String,Integer> map = new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);

        assertEquals(map,ex2.countString(str));

    }
}