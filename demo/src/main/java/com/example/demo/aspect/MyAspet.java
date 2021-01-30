package com.example.demo.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspet {



    @Pointcut("execution(* com.example.demo.impl.*.*(..))")
     // @Pointcut("execution(public com.example.demo.impl.*.service(..))")
   // @Pointcut("execution(public com.example.demo.impl.*(..))")
    public void log(){
    }

    @Around("log()")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        String simpleName = proceedingJoinPoint.getTarget().getClass().getSimpleName();
        String name = proceedingJoinPoint.getSignature().getName();

        Object[] args = proceedingJoinPoint.getArgs();


        System.out.println("log前");
    }

    @After("log()")
    public void afterr(){
        System.out.println("log后");
    }

}
