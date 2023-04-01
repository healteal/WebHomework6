package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EngOperations implements Operations {

    @Value("${eng.hello}")
    private String hello;
    public void hello() {
        System.out.println(hello);
    }

    public void bye() {
        System.out.println("Bye");
    }

    public void welcome() {
        System.out.println("Greetings");
    }

    @PostConstruct
    public void init() {
        welcome();
    }
}
