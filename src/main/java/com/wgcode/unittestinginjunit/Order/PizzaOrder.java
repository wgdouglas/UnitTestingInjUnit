package com.wgcode.unittestinginjunit.Order;

import java.util.List;

public class PizzaOrder {
    private String customerName;
    Address address;
    List<Pizza> pizzas;

    public PizzaOrder(String customerName, Address address, List<Pizza> pizzas) {
        this.customerName = customerName;
        this.address = address;
        this.pizzas = pizzas;
    }
}
