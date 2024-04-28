package com.wgcode.unittestinginjunit.service;

import com.wgcode.unittestinginjunit.Order.Pizza;
import com.wgcode.unittestinginjunit.Order.PizzaOrder;

import java.util.List;
import java.util.stream.Collectors;

public class OrderService {
    public static boolean isValidOrder(PizzaOrder order) {
       if(order.getPizzas().size() == 0 ){
           return false;
       }

           List<Pizza> nonLargePizza = order.getPizzas()
                   .stream()
                   .filter(pizza -> pizza.getSize() != "large")
                   .collect(Collectors.toList());

       return nonLargePizza.size() == 0;
    }
}
