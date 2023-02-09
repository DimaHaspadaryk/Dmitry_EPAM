package service;

import java.util.Arrays;
import java.util.Random;

public class NumbersCount {
    public static void main(String[] args) {
        Random random = new Random();
        int lengthArray = random.nextInt(10) + 1;
        int[] a = new int[lengthArray];
        for (int i = 0; i < a.length; i++) a[i] = random.nextInt(21) - 10;
        System.out.println("Array : " + Arrays.toString(a));
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0) count++;
        }
        System.out.println("Number of - = " + count );

        int positive = 0;
        for(int i = 0;i<a.length;i++){
            if (a[i] > 0)positive++;
        }
        System.out.println("Number of + = " + positive);
    }
}