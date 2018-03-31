package algorithm.dynamicprogramming;

public class KnapSack {

    int maxValueForGivenWeight(int[] weights, int[] values, int n, int w) {
        if (n == -1 || w <= 0) return 0;

        if (w < weights[n]) return maxValueForGivenWeight(weights, values, n - 1, w);

        int valueWithNth = maxValueForGivenWeight(weights, values, n - 1, w - weights[n]) + values[n];
        int valueWithoutNth = maxValueForGivenWeight(weights, values, n - 1, w);

        return Math.max(valueWithNth, valueWithoutNth);
    }

    private Integer[][] dp = new Integer[31][61];

    int maxValueForGivenWeightUsingMemoization(int[] weights, int[] values, int n, int w) {
        if (n == -1 || w <= 0) return 0;
        if (dp[n][w] != null) return dp[n][w];

        int result;
        if (w < weights[n]) {
            result = maxValueForGivenWeight(weights, values, n - 1, w);
            dp[n][w] = result;
            return result;
        }

        int valueWithNth = maxValueForGivenWeightUsingMemoization(weights, values, n - 1, w - weights[n]) + values[n];
        int valueWithoutNth = maxValueForGivenWeightUsingMemoization(weights, values, n - 1, w);

        result = Math.max(valueWithNth, valueWithoutNth);
        dp[n][w] = result;
        return result;
    }
}
