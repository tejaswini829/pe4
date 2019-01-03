
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals
import static org.junit.Assert.assertArrayEquals;

public class CountcharTest {

    @Test
    public void sorting() {
        Countchar count = new Countchar();
        assertArrayEquals(["teju","sushma","ramya"],count.sorting(new String[]{"ramya","sushma","teju"));


    }
}