package com.adouer;

/**
 * 中介---代理对象
 */
public class Proxy implements Rent {
    /**
     * 代理对象组合真实主题
     */
    private Host host;
    public Proxy() {
    }

    /**
     * 构造方法，将代理注入
     * @param host
     */
    public Proxy(Host host) {
        this.host = host;
    }

    /**
     * 委托代理类
     */
    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }

    /**
     * 看房
     */
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    /**
     * 收中介费
     */
    public void fare() {
        System.out.println("中介收中介费");
    }

}
