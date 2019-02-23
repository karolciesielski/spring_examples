package com.sda.spring.pizzaexample.impl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigPizza.class);

        Order order = context.getBean(Order.class);
        Order order2 = context.getBean(Order.class);
        order.order();
        order.setPizzaPrice(50);
        order.order();
        order2.order();
    }
}
