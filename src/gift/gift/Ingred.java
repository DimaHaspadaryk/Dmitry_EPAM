package gift;

public class Ingred {

    public enum ingred{
        FIGURES(8),
        CHOCOLATE(10),
        LOLLIPOPS(3),
        CHOKSEREALS(4),
        CHOUPA(1),
        CANDIES(9),
        CANDIES2(5);

        private int price;

        ingred(int price) {
            this.price = price;
        }



        public int getPrice() {
            return price;
        }
    }


    }


