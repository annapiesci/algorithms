package com.ana.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAlgorithms {
    private static int[] initialArray;
    private static List<Sort> algorithms;

    public static void execute(int[] arr) {
        prepare(arr);
        for (Sort algorithm : algorithms) algorithm.sort();
    }

    public static String writeResult() {

        return "SortingAlgorithms:\n" +
                "initial array = " + Arrays.toString(initialArray) + "\n" +
                Arrays.toString(algorithms.toArray()) + "\n";
    }

    private static void prepare(int[] arr) {
        initialArray = arr;
        algorithms = new ArrayList<>();

        algorithms.add(new BubbleSort(arr));
        algorithms.add(new QuickSortV1(arr));
        algorithms.add(new QuickSortV2(arr));
        algorithms.add(new RadixSort(arr));
        algorithms.add(new MergeSort(arr));
        algorithms.add(new HeapSort(arr));
        algorithms.add(new SelectionSort(arr));
        algorithms.add(new InsertionSort(arr));
        algorithms.add(new BeadSort(arr));
    }
}
