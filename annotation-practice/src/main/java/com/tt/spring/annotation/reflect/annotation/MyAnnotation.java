package com.tt.spring.annotation.reflect.annotation;

import java.lang.annotation.*;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-4-24 0024 15:35
 */
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String desc() default "默认描述,你是傻逼吗？";

    String uri() default "com.tt.spring.annotation";

}
