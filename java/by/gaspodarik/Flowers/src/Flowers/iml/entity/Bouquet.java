package Flowers.iml.entity;

import java.util.*;

public class Bouquet {
    private int bouquetId;
private List<Flower> bouquet = new ArrayList<>();

    public Bouquet() {

    }

    public void addFlower(Flower flower) {
        bouquet.add(flower);
    }

    public Bouquet(int bouquetId, List<Flower> bouquet) {
        this.bouquetId = bouquetId;
        this.bouquet = bouquet;
    }

    public int getBouquetId() {
        return bouquetId;
    }

    public void setBouquetId(int bouquetId) {
        this.bouquetId = bouquetId;
    }

    public List<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(List<Flower> bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "bouquetId=" + bouquetId +
                ", bouquet=" + bouquet +
                '}';
    }
}


