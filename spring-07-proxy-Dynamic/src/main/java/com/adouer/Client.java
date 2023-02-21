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
       /* ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //设置代理的真实主题
        proxyInvocationHandler.setTarget(host);
        //获取代理对象
        Host proxy = (Host) proxyInvocationHandler.getProxy();
        proxy.rent();*/

        //生成UserService代理对象
        UserService userService = new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);
        UserService proxy = (UserService)proxyInvocationHandler.getProxy();
        proxy.add();
    }
}
