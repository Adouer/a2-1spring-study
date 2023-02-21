package com.adouer.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 使用注解配置aop
 */
@Component
@Aspect
public class AnnotationAspect {

    //d定义切点
    @Pointcut("execution(* com.adouer.service.UserServiceImpl.*(..))")
    public void pointCut(){}

    //定义通知
    @Before("pointCut()")
    public void before() {
        System.out.println("==============方法执行前拉拉================");
    }
    //定义通知
   @After("pointCut()")
    public void after() {
        System.out.println("==============方法执行后拉拉================");
    }
    //定义通知
    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("==============环绕前================");
        Object proceed = jp.proceed();  //执行方法
        System.out.println(jp.getSignature());//获得方法签名
        System.out.println("==============环绕后================");
    }
}
