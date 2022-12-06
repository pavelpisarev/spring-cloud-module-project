package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${eureka.instance.instance-id}")
    public String instanceId;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("test"+" instance-id:"+instanceId);
    }
}
