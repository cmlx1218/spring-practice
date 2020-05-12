package com.tt.spring.annotation.multidatasource.annotation;

import java.lang.annotation.*;

/**
 * @Desc 多数据源注解，指定要使用的数据源
 * @Author cmlx
 * @Date 2020-5-12 0012 17:04
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurDataSource {

    String name() default "";

}
