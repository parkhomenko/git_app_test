package com.java.git.test;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[101];

        array[100] = 5050;

        long iterDuration = checkIteratively();
        System.out.println("It took " + iterDuration);

        long formulaDuration = checkByFormula();
        System.out.println("It took " + formulaDuration);

        long start = System.nanoTime();
        int sum = array[100];
        long end = System.nanoTime();
        System.out.println("It took " + (end - start));
    }

    public static long checkIteratively() {
        int sum = 0;
        long start = System.nanoTime();

        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }

	System.out.println("hello again");

        long end = System.nanoTime();
        long duration = end - start;

        System.out.println(sum);

        return duration;
    }

    public static long checkByFormula() {
        int sum = 0;
        long start = System.nanoTime();

        sum = (1 + 1000) * 1000 / 2;

        long end = System.nanoTime();

        System.out.println(sum);

        return end - start;
    }
}
