package com.gupaoedu.vip.spring.formework.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 请求参数映射
 * @author yzy
 *
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPRequestParam {
	
	String value() default "";
	
	boolean required() default true;

}
