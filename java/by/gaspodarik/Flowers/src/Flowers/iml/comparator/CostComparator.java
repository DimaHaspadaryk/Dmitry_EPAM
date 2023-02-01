package Flowers.iml.comparator;


import Flowers.iml.entity.Bouquet;
import Flowers.iml.entity.Flower;

import java.util.Comparator;
public class CostComparator implements Comparator<Flower>{

    @Override
    public int compare(Flower o1, Flower o2) {
        return o1.getCost() - o2.getCost();
    }
}
