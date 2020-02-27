package com.ana.algorithms.sorting;

public class SelectionSort extends Sort {
    SelectionSort(int[] arr) {
        super(arr);
    }

    @Override
    void sort() {
        long startTime = System.nanoTime();
        selectionSort();
        this.elapsedTime = System.nanoTime() - startTime;
    }

    private void selectionSort() {
        //find minimum
        //swap
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[min] > arr[j]) min = j;
            if (min != i) swap(arr, i, min);
        }
    }

}
