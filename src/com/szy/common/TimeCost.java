package com.szy.common;

/**
 * Created by lenovo on 2014/7/13.
 */
public class TimeCost {
    public TimeCost() {
        start = System.currentTimeMillis();
    }

    public int cost() {
        long end = System.currentTimeMillis();
        return (int) (end - start);
    }

    public void pcost() {
        System.out.println(cost());
    }

    private long start;
}
