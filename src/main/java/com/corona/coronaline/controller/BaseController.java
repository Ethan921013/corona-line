package com.corona.coronaline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 클래스가 담겨있는 패키지가 범위대상이된다.
@ControllerAdvice(basePackageClasses = BaseController.class)
@Controller
// error 인터페이스를 상속받아야 기본 error 권한을 가져올수있음
public class BaseController{

    @GetMapping("/")
    public String root() throws Exception {
        throw new Exception("TEST");
//        return  "index";
    }

//    @RequestMapping("/error")
//    public String error(){
//        return "error";
//    }

}
