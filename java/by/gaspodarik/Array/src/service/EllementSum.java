package service;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Random;

public class EllementSum {
    public static void main(String[] args) {
        Random random = new Random();
        int lengthArray = random.nextInt(10) + 1;
        int[] a = new int[lengthArray];
        for (int i = 0; i < a.length; i++) a[i] = random.nextInt(21) - 10;
        System.out.println("Array :  " + Arrays.toString(a));
        int sum = IntStream.of(a).sum();
        System.out.println("Sum = " + sum);
    }
}
