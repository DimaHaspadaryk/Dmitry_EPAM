package service;
import java.util.Arrays;
import java.util.Random;

public class MinValue {
    public static void main(String[] args){
        Random random = new Random();
        int lengthArray = random.nextInt(10) + 1;
        int[] a = new int[lengthArray];
        for (int i = 0; i < a.length; i++) a[i] = random.nextInt(21) - 10;
        System.out.println("Array : " + Arrays.toString(a));
        var min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min Value = " + min);
}
}