package com.tt.spring.annotation.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-4-26 0026 14:58
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface CoverTime {

    int isNeedCover() default 0;    //0-不需要转换

    int type() default 0;           //0-默认装换为时间戳 1-转换为字符串yyyy-MM-dd HH:mm:ss

}
