package com.adouer;

import com.adouer.service.UserService;
import com.adouer.service.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实主题
        Host host = new Host();
        /*
        获取代理对象
         */
        //获得处理器
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //设置代理的真实主题
        proxyInvocationHandler.setTarget(host);
        //获取代理对象
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();
        System.out.println("#############################");
       /* 生成UserService代理对象*/
        // 被代理的类
        UserServiceImpl userService = new UserServiceImpl();
        //获得处理器
        ProxyInvocationHandler proxyInvocationHandler1 = new ProxyInvocationHandler();
        // 设置代理的真实主题
        proxyInvocationHandler1.setTarget(userService);
        //生成代理对象
        UserService proxy1 = (UserService)proxyInvocationHandler1.getProxy();
        proxy1.add();
    }
}
