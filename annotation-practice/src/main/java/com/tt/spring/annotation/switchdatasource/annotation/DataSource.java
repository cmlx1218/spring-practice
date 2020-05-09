package com.tt.spring.annotation.switchdatasource.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @Desc 多数据源切换注释类
 * @Author cmlx
 * @Date 2020-5-9 0009 16:02
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    @AliasFor(attribute = "key")
    String value() default "default";

    @AliasFor(attribute = "value")
    String key() default "default";

}
