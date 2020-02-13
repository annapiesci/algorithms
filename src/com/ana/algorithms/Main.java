package com.ana.algorithms;

import com.ana.algorithms.sorting.SortingAlgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,10,8,7,6,5,3,12,14,2};

        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms(arr);

        sortingAlgorithms.sort();

        System.out.println(sortingAlgorithms.toString());

    }
}
