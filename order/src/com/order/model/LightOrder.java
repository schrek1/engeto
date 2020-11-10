package com.order.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LightOrder {
    private long customerId;
    private List<Long> itemIds;

    public LightOrder(long customerId) {
        this.customerId = customerId;
        this.itemIds = new ArrayList<>();
    }

    public void addOrderItem(long orderItemId) {
        itemIds.add(orderItemId);
    }


    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public List<Long> getItemIds() {
        return itemIds;
    }


    @Override
    public String toString() {
        return "LightOrder{" +
                "customerId=" + customerId +
                ", itemIds=" + itemIds +
                '}';
    }
}
