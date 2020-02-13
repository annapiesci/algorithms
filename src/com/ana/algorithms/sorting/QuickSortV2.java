package com.ana.algorithms.sorting;

class QuickSortV2 extends Sort {

    public QuickSortV2(int[] arr) {
        super(arr);
    }

    void sort() {
        long startTime = System.nanoTime();
        quickSort(0, this.arr.length - 1);
        this.elapsedTime = System.nanoTime() - startTime;
    }

    private void quickSort(int start, int end) {
        if (start < end) {
            int j = partition(start, end);
            quickSort(start, j - 1);
            quickSort(j + 1, end);
        }
    }

    private int partition(int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i < j) {
            while (arr[i] <= pivot && i < j) i++;
            while (arr[j] > pivot) j--;

            if (i < j) swap(arr, i, j);
        }

        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }

}
