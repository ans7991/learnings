package algorithm.sorting;

import util.Utils;

public class InsertionSort {

    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    Utils.swap(numbers, j - 1, j);
                }
            }
        }
    }
}
