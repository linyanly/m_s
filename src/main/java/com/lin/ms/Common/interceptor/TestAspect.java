package com.lin.ms.Common.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class TestAspect {
    @Pointcut("execution(public * com.lin.ms.service.impl.*.*(..))")
    public void webLog(){}
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        log.info("前置......");
    }

    @After("webLog()")
    public void after(JoinPoint joinPoint) throws Throwable {
        log.info("后置......");
    }
   /* @Around("webLog()")
    public void around(JoinPoint joinPoint) throws Throwable {
        log.info("环绕......");
    }*/
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        log.info("返回......");
    }
    @AfterThrowing(pointcut = "webLog()",throwing = "a")
    public void doAfterThrowing(JoinPoint joinPoint,Throwable a) throws Throwable {
        log.info("抛出异常.....");
        log.info("参数:{},错误:{}",joinPoint.getArgs(),a);
    }




}
