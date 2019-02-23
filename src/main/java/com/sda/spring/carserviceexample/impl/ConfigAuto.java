package com.sda.spring.carserviceexample.impl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Config.class)
@ComponentScan("com.sda.spring.example.carserviceexample.impl")
public class ConfigAuto {



}
