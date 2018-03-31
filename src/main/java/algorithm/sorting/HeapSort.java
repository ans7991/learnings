package algorithm.sorting;

import util.Utils;

public class HeapSort {

    void maxHeapify(int[] numbers, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left <= size - 1 && numbers[left] > numbers[i]) {
            largest = left;
        }

        if (right <= size - 1 && numbers[right] > numbers[largest]) {
            largest = right;
        }

        if (largest != i) {
            Utils.swap(numbers, i, largest);
            maxHeapify(numbers, largest, size);
        }
    }

    void buildMaxHeap(int[] numbers) {
        for (int i = numbers.length / 2 - 1; i >= 0; i--) {
            maxHeapify(numbers, i, numbers.length);
        }
    }

    public void sort(int[] numbers) {
        buildMaxHeap(numbers);
        int size = numbers.length;
        for (int i = numbers.length - 1; i >= 0; i--) {
            Utils.swap(numbers, 0, i);
            size = size - 1;
            maxHeapify(numbers, 0, size);
        }
    }
}
