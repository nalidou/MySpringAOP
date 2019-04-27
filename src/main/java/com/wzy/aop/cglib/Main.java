package com.wzy.aop.cglib;

import com.wzy.service.OrderService;
import com.wzy.service.impl.OrderServiceImpl;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;


/**
 * 使用cglib的动态代理
 * 在Spring中如果一个类有顶层接口，则默认使用jdk的动态代理来代理，
 * 如果直接是一个类，则使用cglib动态代理。
 */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(OrderServiceImpl.class);
        enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
        enhancer.setCallback(new MyProxyHandler());
        OrderService orderService = (OrderService)enhancer.create();
        orderService.get();
    }
}
