package com.example.gateway.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Map;

@FeignClient(name = "demo", url = "http://test")
public interface DemoFeignClient {

    @PutMapping(value = "/test")
    void test(Map<String, String> test);

}
