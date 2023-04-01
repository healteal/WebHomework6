package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RusOperations implements Operations {
    @Value ("${rus.hello}")
    private String hello;
    public void hello() {
        System.out.println(hello);
    }

    public void bye() {
        System.out.println("Пока");
    }

    public void welcome() {
        System.out.println("Приветствуем");
    }

    @PostConstruct
    public void init() {
        welcome();
    }
}
