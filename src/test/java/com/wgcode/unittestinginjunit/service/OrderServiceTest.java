package com.wgcode.unittestinginjunit.service;

import com.wgcode.unittestinginjunit.Order.Address;
import com.wgcode.unittestinginjunit.Order.Pizza;
import com.wgcode.unittestinginjunit.Order.PizzaOrder;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrderServiceTest {

    @Test
    void isValid_returnsFalseForAnOrderWithNoPizzas() {
        //****SETUP****
        Address address = new Address(
                "123 Cool St.", "Citytown", "TX");
        PizzaOrder pizzaOrder = new PizzaOrder(
                "John C", address, Collections.emptyList());

        //****EXECUTE****
        boolean isValid = OrderService.isValidOrder(pizzaOrder);

        //****ASSERT****
        assertFalse(isValid);
    }

    @Test
    void isValid_returnsTrueForAnOrderWithNoPizzas() {
        //****SETUP****
        Address address = new Address(
                "123 Cool St.", "Citytown", "TX");
        PizzaOrder pizzaOrder = new PizzaOrder(
                "John C", address, List.of(
                        new Pizza("large", Collections.emptyList())
        ));

        //****EXECUTE****
        boolean isValid = OrderService.isValidOrder(pizzaOrder);

        //****ASSERT****
        assertTrue(isValid);
    }

    @Test
    void isValid_returnsFalseForAnOrderWithMultipleLargeOrExtraLargePizzasAndAnyOtherSize() {
        //****SETUP****
        Address address = new Address("123 Cool St.", "Citytown", "TX");

        Pizza extraLarge = new Pizza("extra-large", Collections.emptyList());
        Pizza large = new Pizza("large", List.of("pepperoni"));
        Pizza small = new Pizza("small", List.of("olives"));

        PizzaOrder pizzaOrder = new PizzaOrder(
                "Pizza Orders", address, List.of(extraLarge,large,small));


        //****EXECUTE****
        boolean isValid = OrderService.isValidOrder(pizzaOrder);

        //****ASSERT****
        assertFalse(isValid);
    }

    @Test
    void isValid_returnsTrueForAnOrderWithAnOrderOfLargeOrXLPizzas() {
        //****SETUP****
        Address address = new Address("123 Cool St.", "Citytown", "TX");

        Pizza extraLarge = new Pizza("extra-large", Collections.emptyList());
        Pizza large = new Pizza("large", List.of("pepperoni"));

        PizzaOrder pizzaOrder = new PizzaOrder(
                "Pizza Orders", address, List.of(extraLarge, large));


        //****EXECUTE****
        boolean isValid = OrderService.isValidOrder(pizzaOrder);

        //****ASSERT****
        assertTrue(isValid);
    }
}