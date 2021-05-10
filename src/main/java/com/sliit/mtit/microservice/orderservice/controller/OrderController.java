package com.sliit.mtit.microservice.orderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping (consumes = "aplication/json", produces = "aplication/json")
    public void createOrder(){

    }

}
