package com.ana.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {
    private int[] arr;
    int  pivotIndex, pivot;
    long elapsedTime;

    public void sort(int[] arr) {
        this.arr = new int[arr.length];
        System.arraycopy(arr,0, this.arr,0,arr.length);

        long startTime = System.nanoTime();
        quickSort(0, arr.length - 1);
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
                swap(i,j);

                i++;
                j--;
            }
        }
        if (start < j)
            quickSort(start, j);
        if (end > i)
            quickSort(i, end);
 }

    private void swap(int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    @Override
    public String toString() {
        return "QuickSort :" + Arrays.toString(arr) + "\n Execution time in milis: " + elapsedTime;
    }
}
