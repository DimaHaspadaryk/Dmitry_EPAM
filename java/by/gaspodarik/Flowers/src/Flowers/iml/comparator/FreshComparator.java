package Flowers.iml.comparator;

import Flowers.iml.entity.Bouquet;
import Flowers.iml.entity.Flower;

import java.util.Comparator;

public class FreshComparator implements Comparator<Flower> {
    @Override
    public int compare(Flower o1, Flower o2) {
        return o1.getFresh() - o2.getFresh();
    }
}
