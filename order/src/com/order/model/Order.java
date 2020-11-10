package com.order.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private Customer customer;
    private List<OrderItem> items;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addOrderItem(OrderItem orderItem) {
        items.add(orderItem);
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", items=" + items +
                '}';
    }
}
