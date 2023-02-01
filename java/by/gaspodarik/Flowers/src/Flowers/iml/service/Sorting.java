package Flowers.iml.service;

import Flowers.iml.comparator.CostComparator;
import Flowers.iml.comparator.FreshComparator;
import Flowers.iml.entity.Flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Sorting {
    public static void main(String[] args) {

        ArrayList<Flower> bouqet = new ArrayList<>();
        bouqet.add(new Flower(22, 8, 11, 6));
        bouqet.add(new Flower(25, 10, 13, 10));
        bouqet.add(new Flower(23, 5, 12, 3));
        System.out.println(bouqet);
        Collections.sort(bouqet, new FreshComparator());
        System.out.println(bouqet);
        Collections.sort(bouqet,new CostComparator());
        System.out.println(bouqet);


    }
}




