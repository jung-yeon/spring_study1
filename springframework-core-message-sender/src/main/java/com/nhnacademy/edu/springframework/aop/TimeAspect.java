package com.nhnacademy.edu.springframework.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimeAspect {
//    @Pointcut("execution( * com.nhnacademy.edu.springframework..sendMessage(..))")
//    public void insendMessage() {
//    }

    @Around("execution( * com.nhnacademy.edu.springframework..sendMessage(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch("Logger");
        try {
            stopWatch.start();

            Object retVal = pjp.proceed();
            return retVal;
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }

    }
}