package com.sliit.mtit.microservice.accountservice.controller;

import com.sliit.mtit.microservice.accountservice.dto.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class AccountController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public void createUser(@RequestBody UserRequest userRequest){

    }
}
