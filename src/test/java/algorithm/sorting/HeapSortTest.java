package algorithm.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HeapSortTest {

    @Test
    public void shouldMaxHeapifyAnArrayAtIndexI() {
        int[] numbers = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        new HeapSort().maxHeapify(numbers, 1, numbers.length);
        assertArrayEquals(new int[]{16, 14, 10, 8, 7, 9, 3, 2, 4, 1}, numbers);
    }

    @Test
    public void shouldBuildAMaxHeap() {
        int[] numbers = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        new HeapSort().buildMaxHeap(numbers);
        assertArrayEquals(new int[]{16, 14, 10, 8, 7, 9, 3, 2, 4, 1}, numbers);
    }

    @Test
    public void shouldSortNumbers() {
        int[] numbers = {3, 6, 2, 8, 9, 4};
        new HeapSort().sort(numbers);
        assertArrayEquals(new int[]{2, 3, 4, 6, 8, 9}, numbers);
    }
}
