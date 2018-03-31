package algorithm.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnapSackTest {

    @Test
    public void shouldFindMaxValueForGivenWeight() {
        int[] weights = new int[]{2, 3, 4, 5, 8, 6, 7, 1, 9, 2, 5, 6, 7, 3, 9, 2, 3, 4, 5, 8, 6, 7, 1, 9, 2, 5, 6, 7, 3, 9, 1, 2};
        int[] values = new int[]{1, 2, 3, 2, 5, 4, 8, 1, 6, 3, 4, 5, 6, 2, 1, 1, 2, 3, 2, 5, 4, 8, 1, 6, 3, 4, 5, 6, 2, 1, 2, 1};

        assertEquals(58, new KnapSack().maxValueForGivenWeight(weights, values, 30, 60));

        assertEquals(58, new KnapSack().maxValueForGivenWeightUsingMemoization(weights, values, 30, 60));
    }
}