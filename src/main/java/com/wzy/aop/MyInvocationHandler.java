package com.wzy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target = null;
    public MyInvocationHandler(Object target) {
        System.out.println("【MyInvocationHandler】 init");
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("【MyInvocationHandler】 invoke method: " + method + " args: " + args);
        if (target == null) {
            throw new RuntimeException("target is null");
        }
        System.out.println("【MyInvocationHandler】 在这里处理");
        return method.invoke(target, args);
    }
}
