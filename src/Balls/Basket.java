package Balls;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Balls> basket = new ArrayList<>();

    public void addBalls(Balls ball) {
        basket.add(ball);
    }

    public double countWeight() {
        double totalWeight = 0;
        for (int i = 0; i < basket.size(); i++) {
            totalWeight = totalWeight + basket.get(i).getWeight();

        }
        return totalWeight;
    }

    public int colorNum(String color) {
        int quantityOfBallsOfSpecificColor = 0;
        for (int a = 0; a < basket.size(); a++) {
            if (basket.get(a).getColor().equals(color)) {
                quantityOfBallsOfSpecificColor++;
            }


        }
        return quantityOfBallsOfSpecificColor;

    }
}







