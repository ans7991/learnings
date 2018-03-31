package algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubArraySumTest {

    @Test
    public void calculateMaximumSubArraySum() {
        int[] numbers = {-2, 3, 2, -1};
        assertEquals(5, new MaximumSubArraySum().calculate(numbers));
    }
}