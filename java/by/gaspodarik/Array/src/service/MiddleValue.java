package service;
import java.util.Arrays;
import java.util.Random;

public class MiddleValue {
    public static void main(String[] args) {
        Random random = new Random();
        int lengthArray = random.nextInt(10) + 1;
        int[] a = new int[lengthArray];
        for (int i = 0; i < a.length; i++) a[i] = random.nextInt(21) - 10;
       System.out.println("Array : " + Arrays.toString(a));
       double average = 0;
       if (a.length > 0) {
            double sum = 0;
            for (int j = 0; j < a.length; j++) {
               sum += a[j];
            }
           average = sum / a.length;
          System.out.println("Middle Value = "+ average);
      }
    }
}
