package algorithm;

public class ContinuousSubArraySum {

    public String find(int[] numbers, int sum) {
        int start = 0;
        int end = 0;
        int calculatedSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (sum == calculatedSum) {
                break;
            } else if (sum > calculatedSum) {
                calculatedSum += numbers[i];
                end = i;
            } else if (sum < calculatedSum) {
                while (sum < calculatedSum) {
                    calculatedSum -= numbers[start];
                    start++;
                }
            }
        }
        return String.valueOf(start) + "," + String.valueOf(end);
    }
}
