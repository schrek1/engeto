package com.order.model;

import java.util.Arrays;

public class LightOrder {
    private long customerId;
    private long[] itemIds;

    public LightOrder(long customerId) {
        this.customerId = customerId;
        this.itemIds = new long[5];
    }

    public void addOrderItem(long orderItemId) {
        itemIds[getLastIndex()] = orderItemId;
    }

    private int getLastIndex() {
        return 0; // todo
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long[] getItemIds() {
        return itemIds;
    }

    public void setItemIds(long[] itemIds) {
        this.itemIds = itemIds;
    }

    @Override
    public String toString() {
        return "LightOrder{" +
                "customerId=" + customerId +
                ", itemIds=" + Arrays.toString(itemIds) +
                '}';
    }
}
