package Flowers.iml;

import java.util.ArrayList;
import java.util.Collections;


public class Sorting {
    public static void main(String[] args) {

        ArrayList bouqet = new ArrayList();
        bouqet.add(new Flower(22, 8, 11, 6));
        bouqet.add(new Flower(25, 10, 13, 10));
        bouqet.add(new Flower(23, 5, 12, 3));

        Collections.sort(bouqet);
        for (Object sorted : bouqet) {
            System.out.println(sorted);
        }

        //for (int i = 0; i < bouqet.size(); i++) {
        // }

    }
}




