package com.order;

import com.order.model.Address;
import com.order.model.Customer;
import com.order.model.Good;
import com.order.model.LightOrder;
import com.order.model.Order;
import com.order.model.OrderItem;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Good radio = new Good(1, "Radio", BigDecimal.valueOf(1000));
        Good tv = new Good(2, "Tv", BigDecimal.valueOf(10000));

        Address address = new Address("Dlouha 3", "Praha");
        Customer customer = new Customer(1, "Jan", "Novak", address);
        Address copyAddress = new Address(address.getStreet(), address.getCity());
        Customer secondCustomer = new Customer(2, "Karel", "Maly", copyAddress);

        Order order = new Order(customer);
        OrderItem firstItem = new OrderItem(radio, 2);
        order.addOrderItem(firstItem);

        LightOrder lightOrder = new LightOrder(customer.getId());
        lightOrder.addOrderItem(tv.getId());

        System.out.println(order);
        System.out.println(lightOrder);
    }


}
