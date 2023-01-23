package Flowers.iml;

import java.util.Objects;


public class Flower {
    static final double MAX_COST = 100;
    static final double MIN_COST = 1;

    static final double MAX_LENGHT = 10;
    static final double MIN_LENGHT = 1;

    static final double MAX_WEIGHT = 15;
    static final double MIN_WEIGHT = 1;

    static final int MAX_FRESH = 10;
    static final int MIN_FRESH = 0;
    private double cost;
    private double lenght;
    private double weight;
    private int fresh;


    public Flower(double cost, double lenght, double weight, int fresh) {
        this.cost = cost;
        this.lenght = lenght;
        this.fresh = fresh;
        this.weight = weight;
    }

    public double getCost() {

        return cost;
    }

    public double getLenght() {

        return lenght;
    }

    public double getWeight() {

        return weight;
    }

    public int getFresh() {

        return fresh;
    }

    public void setCost(double cost) {

        this.cost = cost;
    }

    public void setLenght(double lenght) {

        this.lenght = lenght;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setFresh(int fresh) {

        this.fresh = fresh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.cost, cost) == 0 && Double.compare(flower.lenght, lenght) == 0 && Double.compare(flower.weight, weight) == 0 && fresh == flower.fresh;
    }

    @Override
    public int hashCode() {

        return Objects.hash(cost, lenght, weight, fresh);
    }
}
