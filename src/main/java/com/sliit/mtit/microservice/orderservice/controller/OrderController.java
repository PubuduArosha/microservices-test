package com.sliit.mtit.microservice.orderservice.controller;

import com.sliit.mtit.microservice.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping (consumes = "aplication/json", produces = "aplication/json")
    public void createOrder(@RequestBody OrderRequest request){

    }

}
