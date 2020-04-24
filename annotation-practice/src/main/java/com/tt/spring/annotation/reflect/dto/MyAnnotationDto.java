package com.tt.spring.annotation.reflect.dto;

import com.tt.spring.annotation.reflect.annotation.MyAnnotation;
import lombok.Data;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-4-24 0024 15:38
 */
@Data
@MyAnnotation(desc = "类注解", uri = "com.tt.spring.annotation.reflect.dto")
public class MyAnnotationDto {

    @MyAnnotation(desc = "属性注解", uri = "field")
    public String name;

    public String address;

    @MyAnnotation(desc = "方法注解", uri = "method")
    public void run() {

    }


}
