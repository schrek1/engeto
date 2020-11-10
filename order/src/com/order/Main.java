package com.order;

import com.order.model.Address;
import com.order.model.Customer;
import com.order.model.Good;
import com.order.model.LightOrder;
import com.order.model.Order;
import com.order.model.OrderItem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

        List<String> list = new ArrayList<>();

        Map<String, List<String>> dictionary = new HashMap<>();
        dictionary.put("ahoj", List.of("hi", "hello"));
        dictionary.put("pes", List.of("dog"));

        Set<String> keys = dictionary.keySet();
        Collection<List<String>> values = dictionary.values();
        System.out.println(keys);
        System.out.println(values);
        Set<Map.Entry<String, List<String>>> entries = dictionary.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println(entry);
        }

    }


}
