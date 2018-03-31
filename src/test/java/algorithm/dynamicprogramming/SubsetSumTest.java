package algorithm.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubsetSumTest {

    @Test
    public void shouldFindNumberOfSubsetsWithSumAsN() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(9, new SubsetSum().numberOfSubsetWithSumAsN(numbers, 8, 10));
    }
}
