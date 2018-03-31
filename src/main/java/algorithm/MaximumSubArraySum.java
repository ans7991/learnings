package algorithm;

public class MaximumSubArraySum {
    //Kadane's algorithm
    int calculate(int[] arr) {
        int localMaximumSum = arr[0];
        int globalMaximumSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            localMaximumSum = Math.max(arr[i], localMaximumSum + arr[i]);
            if (localMaximumSum > globalMaximumSum)
                globalMaximumSum = localMaximumSum;
        }
        return globalMaximumSum;
    }
}
