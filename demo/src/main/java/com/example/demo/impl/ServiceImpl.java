package com.example.demo.impl;

import com.example.demo.HelloService;
import org.springframework.stereotype.Service;


@Service
public class ServiceImpl implements HelloService {

    @Override
    public void doPrint() {
        System.out.println("sevice的方法---doPrit");
    }
}
