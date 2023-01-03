package gift;

public enum Package {

    BOX(3),
    Tape(5);


    int price;

    Package(int price) {
        this.price = price;
    }



    public int getPrice() {
        return price;
    }
    }
