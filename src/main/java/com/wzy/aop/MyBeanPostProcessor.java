package com.wzy.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor(){
        System.out.println("【MyBeanPostProcessor】 init");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【MyBeanPostProcessor】 获取IOC容器里的bean：" + beanName);
        if (beanName.equals("orderService")) {
            System.out.println("【MyBeanPostProcessor】为 " + beanName + " 生成代理对象");

            Class[] clszz = new Class[]{bean.getClass().getInterfaces()[0]};
            bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), clszz,
                    new MyInvocationHandler(bean));
        }

        return bean;
    }



}
