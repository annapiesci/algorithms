package com.ana.algorithms;

import com.ana.algorithms.sorting.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,10,8,7,6,5,3,12,14,2};

        System.out.println(Arrays.toString(arr));

        QuickSort sq = new QuickSort();

        sq.sort(arr);

        System.out.println(sq.toString());

    }
}
