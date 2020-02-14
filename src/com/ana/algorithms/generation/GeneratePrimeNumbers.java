package com.ana.algorithms.generation;

class GeneratePrimeNumbers extends Generate {

    GeneratePrimeNumbers(int size) {
        super(size);
    }

    @Override
    public void generate() {
        long startTime = System.nanoTime();
        generatePrimeNumber();
        this.elapsedTime = System.nanoTime() - startTime;
    }

    private void generatePrimeNumber() {

    }
}
