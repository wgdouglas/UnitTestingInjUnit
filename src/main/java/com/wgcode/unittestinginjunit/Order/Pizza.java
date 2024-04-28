package com.wgcode.unittestinginjunit.Order;

import java.util.List;

public class Pizza {
    private String size;
    private List<String> toppings;

    public Pizza(String size, List<String> toppings) {
        this.size = size;
        this.toppings = toppings;
    }
}
