package com.corona.coronaline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// error 인터페이스를 상속받아야 기본 error 권한을 가져올수있음
public class BaseController implements ErrorController {

    @GetMapping("/")
    public String root(){
        return  "index";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }

}
