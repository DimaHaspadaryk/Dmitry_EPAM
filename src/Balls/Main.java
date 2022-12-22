package Balls;


public class Main {
    public static void main(String[] args) {
        String color = "black";
        Balls balls = new Balls(color, 5);
        Basket basket = new Basket();
        basket.addBalls(balls);
        basket.addBalls(balls);
        System.out.println(basket.countWeight());
        basket.colorNum(color);
        System.out.println(basket.colorNum(color));

    }
}

