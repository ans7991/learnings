package algorithm.sorting;

import algorithm.sorting.SelectionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {
    @Test
    public void shouldSortTheArray() {
        int[] numbers = new int[]{3, 6, 2, 8, 9, 5, 4};
        new SelectionSort().sort(numbers);

        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 8, 9}, numbers);
    }
}