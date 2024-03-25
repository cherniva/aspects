package com.cherniva.aspects.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class MyAspect {

    @Around("Pointcuts.allGetMethods()")
    public Object aroundGettingAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        log.info("Around advice before");
        Object ret;
        try {
            ret = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        log.info("Around advice after");
        return ret;
    }

}
