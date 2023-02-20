package entity;

import java.util.*;

public class Warehouse {
    private static final Warehouse instance = new Warehouse();
    private Map<Integer, ArrayStatistic> map = new HashMap<>();

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        return instance;
    }

    public ArrayStatistic put(Integer key, ArrayStatistic value) {
        return map.put(key, value);
    }

    public ArrayStatistic remove(Object key) {
        return map.remove(key);
    }

    public ArrayStatistic replace(Integer key, ArrayStatistic value) {
        return map.replace(key, value);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Warehouse.class.getSimpleName() + "[", "]")
                .add("map=" + map)
                .toString();
    }
}
