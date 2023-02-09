package service;
import java.util.Arrays;
import java.util.Random;

public class MaxValue {
    public static void main(String[] args) {
        Random random = new Random();
        int lengthArray = random.nextInt(10) + 1;
        int[] a = new int[lengthArray];
        for (int i = 0; i < a.length; i++) a[i] = random.nextInt(21) - 10;
        System.out.println("Array " + Arrays.toString(a));
        var max = a[0];
        for(int num : a){
            if (num > max){
                max = num;
            }
        }
        System.out.println("Max Value = " + max);
    }
}
