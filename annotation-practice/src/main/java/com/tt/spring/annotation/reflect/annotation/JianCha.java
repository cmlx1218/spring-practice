package com.tt.spring.annotation.reflect.annotation;

import java.lang.annotation.*;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-4-24 0024 12:28
 */
@Documented
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JianCha {
}
