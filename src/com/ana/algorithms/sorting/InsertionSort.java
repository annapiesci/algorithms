package com.ana.algorithms.sorting;

public class InsertionSort extends Sort {
    InsertionSort(int[] arr) {
        super(arr);
    }

    @Override
    void sort() {
        long startTime = System.nanoTime();
        insertionSort(arr);
        this.elapsedTime = System.nanoTime() - startTime;
    }

    private int[] insertionSort(int[] tempArr) {
        for (int i = 0; i < tempArr.length; i++) {
            for(int j = 0; j < i; j++) {//provereva i-ti element niza sa j-im prethodnim elementom
                if (tempArr[i] <= tempArr[j]) rearrange(tempArr, j, i);
            }
        }
        return tempArr;
    }

    private void rearrange(int[] arr, int start, int end) {
        int temp = arr[end], i;
        for (i = end; i > start; i--) {
            arr[i] = arr[i-1];
        }
        arr[i] = temp;
    }
}
