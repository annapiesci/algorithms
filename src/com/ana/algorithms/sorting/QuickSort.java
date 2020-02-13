package com.ana.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {
    private int[] arr1, arr2;
    int  pivotIndex, pivot;
    long elapsedTime1, elapsedTime2;

    public void sort(int[] arr) {
        this.arr1 = new int[arr.length];
        System.arraycopy(arr,0, this.arr1,0,arr.length);

        this.arr2 = new int[arr.length];
        System.arraycopy(arr,0, this.arr2,0,arr.length);

        long startTime = System.nanoTime();
        quickSort_v1(0, this.arr1.length - 1);
        this.elapsedTime1 = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        quickSort_v2(0, this.arr2.length - 1);
        this.elapsedTime2 = System.nanoTime() - startTime;
    }

    private void quickSort_v1(int start, int end) {
        pivotIndex = start + (end - start) / 2;
        pivot = arr1[pivotIndex];

        int i = start, j = end;

        while (i <= j) {
            while (arr1[i] < pivot) i++;
            while (arr1[j] > pivot) j--;

            if (i <= j) {
                swap(arr1, i , j);

                i++;
                j--;
            }
        }
        if (start < j)
            quickSort_v1(start, j);
        if (end > i)
            quickSort_v1(i, end);
    }

    private void quickSort_v2(int start, int end) {
        if (start < end) {
            int j = partition(start, end);
            quickSort_v2(start, j - 1);
            quickSort_v2(j + 1, end);
        }
    }

    private int partition(int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr2[low];

        while (i < j) {
            while (arr2[i] <= pivot && i < j) i++;
            while (arr2[j] > pivot) j--;

            if (i < j) swap(arr2, i, j);
        }

        arr2[low] = arr2[j];
        arr2[j] = pivot;

        return j;
    }

    private void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    @Override
    public String toString() {
        return "QuickSort - version1 :" + Arrays.toString(arr1) + "\n Execution time in milis: " + elapsedTime1 +
                "\nQuickSort - version2 :" + Arrays.toString(arr2) + "\n Execution time in milis: " + elapsedTime2;
    }
}
