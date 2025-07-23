package com.springcore.spring.beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {
    @Value("Mayanna")
    private String name;
    
    @Value("12")
    private int id;
}
