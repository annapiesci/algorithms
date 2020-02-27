package com.ana.algorithms;

import com.ana.algorithms.exercises.Exercises;
import com.ana.algorithms.linkedList.LinkedListExercises;
import com.ana.algorithms.sorting.SortingAlgorithms;
import com.ana.algorithms.trees.TreesExercises;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,10,8,4,6,5,8,10,4};
        int[] arr2 = {462, 273, 1465, 722, 383};
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        SortingAlgorithms.execute(arr);
        System.out.println(SortingAlgorithms.writeResult());
        /*
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms(arr);
        GenerateFibonacciNumbers fn = new GenerateFibonacciNumbers(9);
        Factorial f = new Factorial();
        Caesar c = new Caesar(15);
        Vigenere v = new Vigenere();

        String s = c.crypt("Cryptography");
        String vs = v.crypt("Cryptography", "ana");

        System.out.println(vs + "\n");
        System.out.println(v.encrypt(vs, "ana"));
        */

        //System.out.println(Exercises.isPalindrome("nije palindrom"));
        //System.out.println(Exercises.isPalindrome(1001));
        //System.out.println(Exercises.isArmstrongNumber(153));
        //System.out.println(Exercises.isArmstrongNumber(135));
        //System.out.println(Exercises.reverse("java"));

        /*
        Exercises.printLeftPyramid(6);

        System.out.println();

        Exercises.printReversedLeftPyramid(6);

        System.out.println();

        Exercises.printRightPyramid(6);

        System.out.println();

        Exercises.printReversedRightPyramid(6);
        */

        //Exercises.removeDuplicatesV1(arr);

        //f.calculate(6);

        //fn.generate();
        //sortingAlgorithms.execute();

        //System.out.println(sortingAlgorithms.toString());
        //System.out.println(fn.toString());

        //Exercises.squareRoot(25);

        //Exercises.squareRoot(81);

        //Exercises.squareRoot(50);

        //Exercises.squareRoot(5);

        //Exercises.squareRoot(100);

        //Exercises.reverseInPlace(arr2);

        //Exercises.reverseWordsInSentence("Write a program to check if two given String is Anagram of each other.");

        //Exercises.isAnagram("eleven plus two", "twelve plus one");

        //Exercises.reverseNumber(123456);

        //Exercises.GCD(54, 24);

        //Exercises.firstNonRepeated("anabanana");

        //LinkedListExercises.test();

        //Exercises.transposeMatrix(matrix);

        TreesExercises.test();
    }
}
