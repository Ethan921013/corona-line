package com.corona.coronaline.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class APIAuthController {

    @GetMapping("/sign-up")
    public String singUp(){
        return "done.";
    }

    @GetMapping("/login")
    public String login(){
        return "done.";
    }

}
