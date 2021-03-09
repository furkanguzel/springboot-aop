package com.furkanguzel.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.furkanguzel.aop.service.MessageService.giveMessage(..))")
    public void beforeTheGiveMessageMethod(JoinPoint joinPoint) {
        System.out.println("Parameter caught before message method param:" + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.furkanguzel.aop.service.*.*(..))")
    public void afterTheGiveMessageMethod(JoinPoint joinPoint) {
        System.out.println("Parameter caught after message method param:" + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

}
