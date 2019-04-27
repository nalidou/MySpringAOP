package com.wzy.aop;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    public MyImportBeanDefinitionRegistrar(){
        System.out.println("【MyImportBeanDefinitionRegistrar】 init");
    }

    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
                                        BeanDefinitionRegistry beanDefinitionRegistry) {
        System.out.println("【MyImportBeanDefinitionRegistrar】 把myBeanPostProcessor以beanDefinition注册到IOC容器中");

        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(MyBeanPostProcessor.class);
        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        beanDefinition.setBeanClass(MyBeanPostProcessor.class);
        beanDefinitionRegistry.registerBeanDefinition("myBeanPostProcessor", beanDefinition);
    }
}
