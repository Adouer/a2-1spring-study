package com.adouer;

/**
 * 房东---真实主题（被代理对象）
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东出租");
    }
}
