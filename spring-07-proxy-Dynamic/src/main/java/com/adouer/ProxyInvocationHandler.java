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
     * 被代理接口对象
     */
    private Object target;

    /**
     * 为set注入提供方法
     * @param target
     */
    public void setTarget(Object target){
        this.target = target;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        return result;
    }
}
