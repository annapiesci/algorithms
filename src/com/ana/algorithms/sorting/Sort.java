package com.ana.algorithms.sorting;

import java.util.Arrays;

abstract class Sort {
    int[] arr;
    long elapsedTime;

    Sort(int[] arr) {
        this.arr = new int[arr.length];
        System.arraycopy(arr,0, this.arr,0,arr.length);
    }

    abstract void sort();

    void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public String toString() {
        return "\n" + getClass().getSimpleName() + ": " + Arrays.toString(arr) + " - Execution time in milis: " + elapsedTime;
    }
}
