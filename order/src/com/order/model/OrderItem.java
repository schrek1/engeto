package com.order.model;

public class OrderItem {
    private Good good;
    private int count;

    public OrderItem(Good good, int count) {
        this.good = good;
        this.count = count;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "good=" + good +
                ", count=" + count +
                '}';
    }
}
