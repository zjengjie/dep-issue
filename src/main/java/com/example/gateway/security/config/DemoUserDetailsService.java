package com.example.gateway.security.config;

import com.example.gateway.feign.client.DemoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import reactor.core.publisher.Mono;

public class DemoUserDetailsService implements ReactiveUserDetailsService {

    @Autowired
    private DemoFeignClient demoFeignClient;

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return Mono.just(new User("hello", "pass", null));
    }

}
