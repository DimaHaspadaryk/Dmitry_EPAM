package gift;
public class Order {

    int orderNum;

    int clientNum;

    String set[] = new String[10];

    public Order(String set[], int orderNum, int clientNum) {
        this.set = set;
        this.orderNum = orderNum;
        this.clientNum = clientNum;
    }

    private int getOrderNum() {
        return orderNum;
    }

    private void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    private int getClientNum(){
        return clientNum = clientNum;
    }
    private void setClientNum(int clientNum){
        this.clientNum = clientNum;
    }


}



