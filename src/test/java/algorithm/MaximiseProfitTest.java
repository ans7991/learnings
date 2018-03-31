package algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximiseProfitTest {

    @Test
    public void shouldReturnMaxProfit() {
        assertEquals(8, new MaximiseProfit().maxProfitWithOneTransaction(new int[]{2, 3, 10, 6, 4, 8, 1}));
        assertEquals(2, new MaximiseProfit().maxProfitWithOneTransaction(new int[]{7, 9, 5, 6, 3, 2}));

        assertEquals("[Interval{buy=0, sell=1}, Interval{buy=2, sell=3}]",
                new MaximiseProfit().maxProfit(new int[]{7, 9, 5, 6, 3, 2}));
    }
}