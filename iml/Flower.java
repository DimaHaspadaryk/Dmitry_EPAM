package Flowers.iml;

public class Flower {

    private double cost;

    private double MAX_COST = 100;
    private double MIN_COST = 1;
    private double lenght;

    private double MAX_LENGHT = 10;
    private double MIN_LENGHT = 1;
    private double weight;

    private double MAX_WEIGHT = 15;
    private double MIN_WEIGHT = 1;
    private int fresh;

    private int MAX_FRESH = 10;
    private int MIN_FRESH = 0;

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
}
