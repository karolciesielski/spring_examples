package com.sda.spring.pizzaexample.impl;

import com.sda.spring.pizzaexample.api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Qualifier("vege")
@PropertySource("pizzamenu.properties")
@Component
public class VegePizza implements IPizza {

    public int price;
    public String name;

    public VegePizza(@Value("${vege_pizza_name}") String name, @Value("${vege_pizza_price}") int price) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
