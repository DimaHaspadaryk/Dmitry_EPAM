package Flowers.iml;

public class Main {
    public static void main(String[] args) {
        Bouquet buiqet = new Bouquet();
        Flower flower1 = new Flower(25,10,13,10);
        Flower flower2 = new Flower(22,8,11,6);
        Flower flower3 = new Flower(23,5,12,3);
        buiqet.addFlower(flower1);
        buiqet.addFlower(flower2);
        buiqet.addFlower(flower3);



    }
}
