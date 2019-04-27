package com.wzy;


import com.wzy.aop.EnableMyAOP;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan("com.wzy")
//@EnableAspectJAutoProxy
@EnableMyAOP
public class ApplicationConfig {
}
