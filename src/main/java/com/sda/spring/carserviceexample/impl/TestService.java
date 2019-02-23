package com.sda.spring.carserviceexample.impl;

import com.sda.spring.carserviceexample.api.ITest;
import com.sda.spring.carserviceexample.api.IAuto;
import org.springframework.stereotype.Component;

@Component
public class TestService implements ITest {

    private IAuto autoService;

    public IAuto getAutoService() {
        return autoService;
    }

    public void setAutoService(IAuto autoService) {
        this.autoService = autoService;
    }

    public TestService(IAuto autoService) {
        this.autoService = autoService;
    }

    public void test() {
        System.out.println(autoService.getCarName() + " jedzie, rocznik: " + autoService.getCarYear());
    }
}
