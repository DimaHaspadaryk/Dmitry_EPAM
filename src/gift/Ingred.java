package gift;

public class Ingred {

    public enum ingred{
        Figures(8),
        Chokolate(10),
        Lollipops(3),
        ChokCereals(4),
        Choupa(1),
        Candies(9),
        Candies2(5);

        ingred(int price) {
            this.price = price;
        }

        private int price;

        public int getPrice() {
            return price;
        }
    }


    }


