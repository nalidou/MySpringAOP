package com.wzy.aop;


import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义AOP开关
 * 若在启动类上标注此注解，则自动导入MyImportBeanDefinitionRegistrar
 */

@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface EnableMyAOP {
}
