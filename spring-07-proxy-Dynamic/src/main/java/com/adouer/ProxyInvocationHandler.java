package com.adouer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理工具类【用于生成代理类】
 * 生成过程由客户决定
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理对象
     */
    private Object target;

    /**
     * 为set注入提供方法
     *
     * @param target 被代理对象
     */
    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 创建代理对象
     *
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "方法执行前逻辑");
        Object result = method.invoke(target, args);
        System.out.println(method.getName() + "方法执行后逻辑");
        return result;
    }
}