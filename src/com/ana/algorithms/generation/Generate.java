package com.ana.algorithms.generation;

import java.util.Arrays;

abstract class Generate {
    int[] arr;
    long elapsedTime;

    Generate(int size) {
        this.arr = new int[size];
    }

    abstract void generate();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": {" +
                "arr=" + Arrays.toString(arr) +
                ",\nelapsedTime=" + elapsedTime +
                '}';
    }
}
