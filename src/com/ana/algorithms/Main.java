package com.ana.algorithms;

import com.ana.algorithms.calculation.Factorial;
import com.ana.algorithms.cryptography.Caesar;
import com.ana.algorithms.generation.GenerateFibonacciNumbers;
import com.ana.algorithms.sorting.SortingAlgorithms;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,10,8,7,6,5,3,12,14};
        //int[] arr = {462, 273, 1465, 722, 383};

        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms(arr);
        GenerateFibonacciNumbers fn = new GenerateFibonacciNumbers(9);
        Factorial f = new Factorial();
        Caesar c = new Caesar(6);

        String s = c.crypt("Cryptography");

        System.out.println(s + "\n");
        System.out.println(c.encrypt(s));

        //f.calculate(6);

        //fn.generate();
        //sortingAlgorithms.execute();

        //System.out.println(sortingAlgorithms.toString());
        //System.out.println(fn.toString());
    }
}
