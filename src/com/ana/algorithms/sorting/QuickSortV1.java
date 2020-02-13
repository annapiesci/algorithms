package com.ana.algorithms.sorting;

import java.util.Arrays;

class QuickSortV1 extends Sort {
    int  pivotIndex, pivot;

    public QuickSortV1(int[] arr) {
        super(arr);
    }

    void sort() {
        long startTime = System.nanoTime();
        quickSort(0, this.arr.length - 1);
        this.elapsedTime = System.nanoTime() - startTime;
    }

    private void quickSort(int start, int end) {
        pivotIndex = start + (end - start) / 2;
        pivot = arr[pivotIndex];

        int i = start, j = end;

        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;

            if (i <= j) {
                swap(arr, i , j);

                i++;
                j--;
            }
        }
        if (start < j)
            quickSort(start, j);
        if (end > i)
            quickSort(i, end);
    }



}
