package com.example.demo.controller;


import com.example.demo.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCOntroller {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/test")
    public void xx(String id){
        helloService.doPrint();
    }
}
