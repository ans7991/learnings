package algorithm;

public class MaximumSubArraySum {
    //Kadane's algorithm
    int calculate(int[] arr) {
        int max = arr[0];
        int maxG = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max + arr[i]);
            if (max > maxG)
                maxG = max;
        }
        return maxG;
    }
}
