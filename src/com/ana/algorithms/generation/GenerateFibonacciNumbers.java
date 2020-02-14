package com.ana.algorithms.generation;

public class GenerateFibonacciNumbers extends Generate {
    private long elapsedTime2;
    public GenerateFibonacciNumbers(int size) {
        super(size);
    }

    @Override
    public void generate() {
        long startTime = System.nanoTime();
        generateFibonacciNumbers(arr.length);
        this.elapsedTime = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        generateFibonacciNumbers(0, 0, 1);
        this.elapsedTime2 = System.nanoTime() - startTime;
    }

    private void generateFibonacciNumbers(int count) {
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
         arr[i] = fibonacciRecursion(i);
        }
    }

    private void generateFibonacciNumbers(int count, int prev, int next) {
        if (count != arr.length - 1) {
            count++;
            generateFibonacciNumbers(count, next, next + prev);
        }
        arr[count] = next;
    }

    private int fibonacciRecursion(int i) {
        if (i == 0) return 0;
        if (i == 1 || i == 2) return 1;
        return fibonacciRecursion(i - 1) + fibonacciRecursion(i - 2);
    }

    @Override
    public String toString() {
        return super.toString() + "\nelapsedTime2=" + elapsedTime2 ;
    }
}
