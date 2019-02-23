package com.sda.spring.carserviceexample.impl;

import com.sda.spring.carserviceexample.api.IAuto;

public class AutoNormal implements IAuto {

    private String carName;
    private int carYear;

    public AutoNormal(String carName, int carYear) {
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
        System.out.println("AutoNormal Normal jedzie.");
    }
}
