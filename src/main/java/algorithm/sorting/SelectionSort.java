package algorithm.sorting;

import util.Utils;

public class SelectionSort {
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[min] > numbers[j]) {
                    min = j;
                }
            }
            Utils.swap(numbers, i, min);
        }
    }
}
