package com.adouer;

public class Client {

    public static void main(String[] args) {
        //房东出租房子
        Host host = new Host();
        //代理帮房东出租房子
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
