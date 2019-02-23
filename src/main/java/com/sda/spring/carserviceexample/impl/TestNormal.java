package com.sda.spring.carserviceexample.impl;

import com.sda.spring.carserviceexample.api.ITest;
import com.sda.spring.carserviceexample.api.IAuto;

public class TestNormal implements ITest {

    private IAuto autoNormal;

    public TestNormal(IAuto autoNormal) {
        this.autoNormal = autoNormal;
    }

    public IAuto getAutoNormal() {
        return autoNormal;
    }

    public void setAutoNormal(IAuto autoNormal) {
        this.autoNormal = autoNormal;
    }

    public void test() {
        System.out.println(autoNormal.getCarName() + " jedzie, rocznik: " + autoNormal.getCarYear());
    }
}
