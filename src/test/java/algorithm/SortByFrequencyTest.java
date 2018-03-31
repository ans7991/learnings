package algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortByFrequencyTest {

    @Test
    public void sortByFrequency() {
        assertArrayEquals(new int[]{4, 4, 5, 5, 3, 6}, new SortByFrequency().sort(new int[]{5, 5, 4, 6, 4, 3}));
    }
}