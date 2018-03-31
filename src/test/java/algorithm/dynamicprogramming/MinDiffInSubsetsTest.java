package algorithm.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinDiffInSubsetsTest {
    @Test
    public void shouldFindMinimumDifferenceInTwoSubsetsOfASet() {
        assertEquals(1, new MinDiffInSubsets().findByRecursion(new int[]{10, 9}));
        assertEquals(2, new MinDiffInSubsets().findByRecursion(new int[]{10, 9, 7, 6, 4}));
        assertEquals(0, new MinDiffInSubsets().findByRecursion(new int[]{10, 9, 7, 6, 4, 2, 3, 4, 7}));
        assertEquals(1, new MinDiffInSubsets().findByRecursion(new int[]{10, 7, 6, 4}));
        assertEquals(0, new MinDiffInSubsets().findByRecursion(new int[]{10, 9, 7, 4, 2}));
        assertEquals(0, new MinDiffInSubsets().findByRecursion(new int[]{9, 7, 6, 4}));
        assertEquals(2, new MinDiffInSubsets().findByRecursion(new int[]{5, 9, 8, 6, 4}));

//        assertEquals(1, new MinDiffInSubsets().findByRecursion(new int[]{10, 9, 7, 6, 4, 32, 4, 67, 8, 44, 3, 54, 8, 78, 63, 11, 2, 1, 3, 42, 90, 7, 32, 18, 10, 9, 7, 6}));
    }

    @Test
    public void shouldFindMinimumDifferenceInTwoSubsetsOfASetUsingDP() {
        assertEquals(1, new MinDiffInSubsets().findByDynamicProgramming(new int[]{10, 9}));
        assertEquals(0, new MinDiffInSubsets().findByDynamicProgramming(new int[]{10, 9, 7, 6, 4, 2}));
        assertEquals(1, new MinDiffInSubsets().findByDynamicProgramming(new int[]{10, 7, 6, 4}));
        assertEquals(0, new MinDiffInSubsets().findByDynamicProgramming(new int[]{10, 9, 7, 4, 2}));
        assertEquals(0, new MinDiffInSubsets().findByDynamicProgramming(new int[]{9, 7, 6, 4}));
        assertEquals(2, new MinDiffInSubsets().findByDynamicProgramming(new int[]{5, 9, 8, 6, 4}));
        assertEquals(2, new MinDiffInSubsets().findByDynamicProgramming(new int[]{2, 2, 2, 2, 2}));

        assertEquals(1, new MinDiffInSubsets().findByDynamicProgramming(new int[]{10, 9, 7, 6, 4, 32, 4, 67, 8, 44, 3, 54, 8, 78, 63, 11, 2, 1, 3, 42, 90, 7, 32, 18, 10, 9, 7, 6}));
    }
}