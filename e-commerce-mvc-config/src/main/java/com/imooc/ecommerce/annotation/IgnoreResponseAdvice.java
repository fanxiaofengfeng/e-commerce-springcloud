package com.imooc.ecommerce.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 忽略统一响应注解定义
 */
@Target({ElementType.TYPE,ElementType.METHOD})//该注解可以应用于类（TYPE）和方法（METHOD）上
@Retention(RetentionPolicy.RUNTIME) //该注解在运行时仍然可用，可以通过反射机制获取到该注解的信息。
public @interface IgnoreResponseAdvice {
}
