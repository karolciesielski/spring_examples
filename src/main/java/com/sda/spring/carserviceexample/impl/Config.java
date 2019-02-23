package com.sda.spring.carserviceexample.impl;

import com.sda.spring.carserviceexample.api.IAuto;
import com.sda.spring.carserviceexample.api.ITest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("cars.properties")
@Configuration
public class Config {

    @Qualifier("normal")
    @Bean
    IAuto getAutoNormal(){
        return new AutoNormal("Audi A4", 2018);
    }
//
//    @Qualifier("service")
//    @Bean
//    IAuto getAutoService(){
//        return new AutoService("Audi S4", 2018);
//    }

    @Bean
    ITest getTestNormal(@Qualifier("normal") IAuto auto){
        return new TestNormal(auto);
    }
//
//    @Bean
//    ITest getTestService(@Qualifier("service") IAuto auto){
//        return new TestService(auto);
//    }

}
