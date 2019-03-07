package com.example.gateway.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@EnableWebFluxSecurity
public class SecurityConfiguration {

    @Bean
    public DemoUserDetailsService demoUserDetailsService() {
        return new DemoUserDetailsService();
    }

}
