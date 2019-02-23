package com.sda.spring.carserviceexample.impl;

import com.sda.spring.carserviceexample.api.IAuto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Qualifier("serviceCar")
@PropertySource("cars.properties")
@Component
public class AutoService implements IAuto {
    private String carName;
    private int carYear;

    public AutoService(@Value("${service_name}") String carName, @Value("${service_year}") int carYear) {
        this.carName = carName;
        this.carYear = carYear;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public void run() {
        System.out.println("Auto Service jedzie.");
    }
}
