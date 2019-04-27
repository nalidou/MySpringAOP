package com.wzy.aop.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyProxyHandler implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {

        System.out.println("使用 cglib 动态代理");
        return methodProxy.invokeSuper(o, objects);
    }
}
