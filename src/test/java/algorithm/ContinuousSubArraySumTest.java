package algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContinuousSubArraySumTest {

    @Test
    public void shouldFindContinuousSubArrayWithGivenSum() {
        int[] numbers = {1, 2, 3, 1, 2, 1, 2, 3, 1, 2};
        assertEquals("1,4", new ContinuousSubArraySum().find(numbers, 8));
    }
}