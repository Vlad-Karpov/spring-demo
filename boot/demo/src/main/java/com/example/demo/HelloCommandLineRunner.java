package com.example.demo;

import com.example.demo.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloCommandLineRunner implements CommandLineRunner {

    private final HelloService helloService;

    public HelloCommandLineRunner(@Autowired HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public void run(String... args) throws Exception {
        helloService.sayHello("World");
    }
}
