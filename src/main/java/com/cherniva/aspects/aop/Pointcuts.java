package com.cherniva.aspects.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* com.cherniva.aspects.service..get*(..))")
    public void allGetMethods() {};

//    @Pointcut("execution(* com.cherniva.aspects.service.add*(..))")
//    public void allAddMethods() {};
}
