package com.ana.algorithms.sorting;

import java.util.Arrays;

class BubbleSort extends Sort {

    public BubbleSort(int[] arr) {
        super(arr);
    }

    void sort() {
        long startTime = System.nanoTime();
        bubbleSort();
        this.elapsedTime = System.nanoTime() - startTime;
    }

    private void bubbleSort () {
        int pos = arr.length - 1;
        int bound;

        while (pos != 0) {
            bound = pos;
            pos = 0;

            for(int i = 0; i < bound; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i+1);
                    pos = i;
                }
            }
        }
    }
}
