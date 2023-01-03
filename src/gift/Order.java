package gift;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private long orderNum;
    private String orderName;
    private long clientNum;

    List<Ingred> sweets = new ArrayList<>();

    private Package pack;

    private LocalDateTime LocalDataTime = LocalDateTime.now();

    private boolean presentGeetingCard = true;

    public Order(long orderNum, String orderName, long clientNum, Package pack) {
        this.orderNum = orderNum;
        if(orderName.length() <= 20 && orderName.length() >= 4) {
            this.orderName = orderName;
        }    else {
            this.orderName = "Клиент" + orderNum;
        }


        this.orderName = orderName;
        this.clientNum = clientNum;
        this.pack = pack;
    }

    public long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(long orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public long getClientNum() {
        return clientNum;
    }

    public void setClientNum(long clientNum) {
        this.clientNum = clientNum;
    }

    public Package getPack() {
        return pack;
    }

    public void setPack(Package pack) {
        this.pack = pack;
    }

    public LocalDateTime getLocalDataTime() {
        return LocalDataTime;
    }

    public void setLocalDataTime(LocalDateTime localDataTime) {
        LocalDataTime = localDataTime;
    }

    public boolean isPresentGeetingCard() {
        return presentGeetingCard;
    }

    public void setPresentGeetingCard(boolean presentGeetingCard) {
        this.presentGeetingCard = presentGeetingCard;
    }
}







