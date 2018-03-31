package algorithm;

import java.util.ArrayList;

public class MaximiseProfit {

    int maxProfitWithOneTransaction(int[] prices) {
        int profit = 0;
        int min = 99999;
        for (int price : prices) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        return profit;
    }

    String maxProfit(int[] prices) {
        ArrayList<Interval> result = new ArrayList<>();
        int n = prices.length;
        int i = 0;
        while (i < n - 1) {
            Interval interval = new Interval();
            while (i < n - 1 && prices[i + 1] <= prices[i])
                i++;
            if (i == n - 1)
                break;
            interval.buy = i++;

            while (i < n && prices[i] >= prices[i - 1])
                i++;
            interval.sell = i - 1;

            result.add(interval);
        }
        return result.toString();
    }

    private class Interval {
        int buy;
        int sell;

        @Override
        public String toString() {
            return "Interval{" +
                    "buy=" + buy +
                    ", sell=" + sell +
                    '}';
        }
    }
}

