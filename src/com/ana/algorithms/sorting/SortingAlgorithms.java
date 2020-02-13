package com.ana.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAlgorithms {
    private int[] initialArray;
    private List<Sort> algorithms;

    public SortingAlgorithms(int[] arr){
        initialArray = arr;
        algorithms = new ArrayList<>();

        algorithms.add(new BubbleSort(arr));
        algorithms.add(new QuickSortV1(arr));
        algorithms.add(new QuickSortV2(arr));
        algorithms.add(new RadixSort(arr));
    }

    public void sort() {
        for (Sort algorithm : algorithms) algorithm.sort();
    }

    @Override
    public String toString() {

        return "SortingAlgorithms:\n" +
                "initial array = " + Arrays.toString(initialArray) + "\n" +
                Arrays.toString(algorithms.toArray()) + "\n";
    }
}
