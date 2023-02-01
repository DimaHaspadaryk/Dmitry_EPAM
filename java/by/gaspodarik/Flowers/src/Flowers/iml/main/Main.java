package Flowers.iml.main;

import Flowers.iml.entity.Bouquet;
import Flowers.iml.entity.Flower;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Bouquet bouqet = new Bouquet();
        Flower flower1 = new Flower(25, 10, 13, 10);
        Flower flower2 = new Flower(22, 8, 11, 6);
        Flower flower3 = new Flower(23, 5, 12, 3);
        bouqet.addFlower(flower1);
        bouqet.addFlower(flower2);
        bouqet.addFlower(flower3);




    }


}

