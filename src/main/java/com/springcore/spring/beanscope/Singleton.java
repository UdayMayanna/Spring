package com.springcore.spring.beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Singleton {
   @Value("Uday")
   private String name;
}
