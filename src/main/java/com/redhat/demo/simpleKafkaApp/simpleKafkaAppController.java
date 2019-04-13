package com.redhat.demo.simpleKafkaApp;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class simpleKafkaAppController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello-world")
    @ResponseBody
    public simpleKafkaAppGreeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new simpleKafkaAppGreeting(counter.incrementAndGet(), String.format(template, name));
    }

}