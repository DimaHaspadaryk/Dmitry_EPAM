package observer;

import entity.ArrayStatistic;
import entity.CustomArray;
import entity.Warehouse;

import java.util.Observable;
import java.util.Observer;

public class ArrayStatisticObserved implements Observer {

    public void changeArrayElement(CustomArray customArray) {
        ArrayStatistic statistic = new ArrayStatistic(customArray);
        int id = customArray.getArrayId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, statistic);
        System.out.println(statistic.toString());
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
