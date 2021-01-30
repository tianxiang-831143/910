package com.example.demo.config;

import com.example.demo.aspect.MyAspet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Aspect {
    @Bean
    public MyAspet getHelloAspct(){
        return new MyAspet();
    }
}
