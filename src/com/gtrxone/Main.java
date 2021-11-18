package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        int foundNumberCount = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Found number = " + i);
                foundNumberCount++;
                sum += i;
                if (foundNumberCount == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of found numbers = " + sum);
    }
}
