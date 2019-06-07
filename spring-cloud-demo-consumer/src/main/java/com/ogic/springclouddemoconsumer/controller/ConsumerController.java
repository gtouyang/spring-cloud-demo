package com.ogic.springclouddemoconsumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer/list")
    public List listAllDemo(){
        return restTemplate.getForObject("http://localhost:8081/provider/list", List.class);
    }
}
