package com.sda.spring.carserviceexample.impl;

import com.sda.spring.carserviceexample.api.ITest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppNew {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigAuto.class);

        ITest test = context.getBean(TestNormal.class);
        test.test();
        ITest test2 = context.getBean(TestService.class);
        test2.test();
    }
}
