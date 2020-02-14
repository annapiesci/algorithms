package com.ana.algorithms.calculation;

public class Factorial {
    long elapsedTime;

    public void calculate(int n) {
        int f;
        long startTime = System.nanoTime();
        f = factorial(n);
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Factorial of " + n + " is: " + f + " elapsed time is: " + elapsedTime);
    }

    private int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
