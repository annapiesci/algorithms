package com.ana.algorithms;

import com.ana.algorithms.sorting.SortingAlgorithms;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,10,8,7,6,5,3,12,14};
        //int[] arr = {462, 273, 1465, 722, 383};

        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms(arr);

        sortingAlgorithms.execute();

        System.out.println(sortingAlgorithms.toString());

    }
}
