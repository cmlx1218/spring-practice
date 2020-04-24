package com.tt.spring.annotation.reflect.test;

import com.tt.spring.annotation.reflect.annotation.MyAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-4-24 0024 15:41
 */
public class TestMyAnnotation {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("com.tt.spring.annotation.reflect.dto.MyAnnotationDto");
        Object o = clazz.newInstance();

        MyAnnotation annotation1 = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(annotation1.desc());
        System.out.println(annotation1.getClass().getMethod("desc").invoke(annotation1));

        Field name = clazz.getDeclaredField("name");
        MyAnnotation annotation2 = name.getAnnotation(MyAnnotation.class);
        System.out.println(annotation2.desc());
        System.out.println(annotation2.getClass().getMethod("desc").invoke(annotation2));

        Method[] methods = clazz.getMethods();
//        Arrays.stream(methods).forEach(method -> {
//            boolean annotationPresent = method.isAnnotationPresent(MyAnnotation.class);
//            if (annotationPresent) {
//                System.out.println(method.getAnnotation(MyAnnotation.class).desc());
//            }
//        });

        for (Method method : methods) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);


            boolean annotationPresent = method.isAnnotationPresent(MyAnnotation.class);
            if (annotationPresent) {
                System.out.println(method.getAnnotation(MyAnnotation.class).desc());
            }

        }

    }

}
