package service;

import entity.CustomArray;

import java.util.stream.IntStream;

public class ServiceArray {
    public int findNumber(CustomArray array) {
        int[] arr = array.getArray();
        int findNumber = arr[0];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) count++;
            return count;
        }

        int positive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) positive++;
        }
        return positive;
    }

    public int findMax(CustomArray array) {
        int[] arr = array.getArray();
        int resMax = arr[0];
        for (int value : arr) {
            if (value > resMax) {
                resMax = value;
            }
        }
        return resMax;
    }
    public int findMin(CustomArray array) {
        int[] arr = array.getArray();
        var min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public int findMiddle(CustomArray array) {
        int[] arr = array.getArray();
        int resMiddle = arr[0];
        double average = 0;
        if (arr.length > 0) {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            average = sum / arr.length;
        }

        return resMiddle;
    }

    public int findSum(CustomArray array) {
        int[] arr = array.getArray();
        int Sum = arr[0];
        int sum = IntStream.of(arr).sum();


        return Sum;
    }


}

