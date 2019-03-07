package com.example.gateway.web;

import com.example.gateway.feign.client.DemoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class DemoController {

    @Autowired
    private DemoFeignClient demoFeignClient;

    @GetMapping("/")
    public Mono<String> welcome() {
        return Mono.just("/hello");
    }
}