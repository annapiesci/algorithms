package com.ana.algorithms.sorting;

import java.util.Arrays;

class MergeSort extends Sort {
    MergeSort(int[] arr) {
        super(arr);
    }

    @Override
    void sort() {
        long startTime = System.nanoTime();
        mergeSort(arr);
        this.elapsedTime = System.nanoTime() - startTime;
    }

    private int[] mergeSort(int[] tempArr) {
        //moze da se optimizuje
        int[] ran1, ran2; //ovo mi mozda ne treba
        if (tempArr.length != 1) {
            int size = tempArr.length / 2;
            int j = 0, k = 0;
            ran1 = new int[size];
            ran2 = new int[size + tempArr.length % 2];

            populate(tempArr, ran1, 0, size);
            populate(tempArr, ran2, size, tempArr.length);

            mergeSort(ran1);
            mergeSort(ran2);

            for (int i = 0; i < tempArr.length; i++) {
                //TODO sredi ovo
                if (j < ran1.length) {
                    if (k < ran2.length) {
                        if (ran1[j] < ran2[k]) {
                            tempArr[i] = ran1[j];
                            j++;
                        }
                        else {
                            tempArr[i] = ran2[k];
                            k++;
                        }
                    }
                    else {
                        tempArr[i] = ran1[j];
                        j++;
                    }
                }
                else {
                    tempArr[i] = ran2[k];
                    k++;
                }
            }
        }
        //sortiran niz od 1 elementa
        return tempArr;
    }

    private void populate(int[] src, int[] dest, int start, int end) {
        int j = 0;
        for(int i = start; i < end; i++) {
            dest[j] = src[i];
            j++;
        }
    }
}
