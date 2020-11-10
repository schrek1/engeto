package com.order.model;

import java.util.Arrays;

public class Order {
    private Customer customer;
    private OrderItem[] items;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new OrderItem[5];
    }

    public void addOrderItem(OrderItem orderItem) {
        items[getLastIndex()] = orderItem;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderItem[] getItems() {
        return items;
    }

    private int getLastIndex() {
        return 0;// todo return last index
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
