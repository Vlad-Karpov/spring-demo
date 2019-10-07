package com.example.demo.hello;

import org.springframework.stereotype.Component;

public class ConsoleHelloService implements HelloService {

    private String prefix;
    private String suffix;

    public ConsoleHelloService() {
        this(null, null);
    }

    public ConsoleHelloService(String prefix, String suffix) {
        this.prefix = prefix != null ? prefix : "Hello";
        this.suffix = suffix != null ? suffix : "!";
    }

    @Override
    public void sayHello(String name) {
        String msg = String.format("%s %s%s", prefix, name, suffix);
        System.out.println(msg);
    }
}
