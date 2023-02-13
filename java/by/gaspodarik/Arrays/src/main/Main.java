package main;

import entity.CustomArray;
import service.ServiceArray;

public class Main {
    public static void main(String[] args) {
        ServiceArray serviceArray = new ServiceArray();
        CustomArray array = new CustomArray(new int[]{1,3,4,5,6});
        int max = serviceArray.findMin(array);
        System.out.println(max);
    }
}