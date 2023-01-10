package gift;

public enum Package {

    BOX(3),
    TAPE(5);


    int price;

    Package(int price) {
        this.price = price;
    }



    public int getPrice() {
        return price;
    }
    }
