package com.sda.spring.pizzaexample.impl;

import com.sda.spring.pizzaexample.api.IOrder;
import com.sda.spring.pizzaexample.api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Order implements IOrder {

    private IPizza pizza;

    public Order(@Value("#{classicPizza}") IPizza pizza) {
        this.pizza = pizza;
    }

    public void order() {
        System.out.println(String.format("Zamówiono pizzę %s, do zapłaty %d zł", pizza.getName(), pizza.getPrice() ));
    }

    public void setPizzaPrice(int price) {
        pizza.setPrice(price);
    }
}
