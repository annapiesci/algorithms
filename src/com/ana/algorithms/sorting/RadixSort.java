package com.ana.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

class RadixSort extends Sort {
    private List<Integer>[] sortingArr;
    private int div = 1, mod = 10;

    RadixSort(int[] arr) {
        super(arr);
    }

    @Override
    void sort() {
        long startTime = System.nanoTime();
        radixSort(true);
        this.elapsedTime = System.nanoTime() - startTime;
    }

    private void radixSort(boolean firstIteration) {
        initialise();

        if (!firstIteration) {
            div *= 10;
            mod *= 10;
        }

        for(int i = 0; i < this.arr.length; i++) {
            int index = (this.arr[i] % mod) / div;
            sortingArr[index].add(this.arr[i]);
        }

        rearrange();

        if (sortingArr[0].size() != this.arr.length) radixSort(false);


    }

    private void initialise() {
        sortingArr = (ArrayList<Integer>[]) new ArrayList[10];
        for(int i = 0; i < 10; i++) {
            sortingArr[i] = new ArrayList<>();
        }
    }

    private void rearrange() {
        int j = 0;
        for(int i = 0; i < 10; i++) {
            if (sortingArr[i].size() == 0) continue;
            for (int k = 0; k < sortingArr[i].size(); k++) {
                arr[j] = sortingArr[i].get(k);
                j++;
            }
        }
    }
}
