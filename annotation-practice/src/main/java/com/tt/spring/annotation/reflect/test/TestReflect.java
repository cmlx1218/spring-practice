package com.tt.spring.annotation.reflect.test;

import com.tt.spring.annotation.reflect.annotation.JianCha;
import com.tt.spring.annotation.reflect.dto.NoBugDto;

import java.lang.reflect.Method;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-4-24 0024 14:29
 */
public class TestReflect {

    public static void main(String[] args) {
        NoBugDto noBugDto = new NoBugDto();

        Class clazz = noBugDto.getClass();
        Method[] methods = clazz.getMethods();

        // 记录产生的log信息
        StringBuilder log = new StringBuilder();

        // 记录异常数
        int errorNumber = 0;


        for (Method method : methods) {

            if (method.isAnnotationPresent(JianCha.class)) {
                // true表示反射对象应该在使用时抑制Java语言访问检查
                // false表示反射的对象应该强制执行Java语言访问检查


                try {
                    method.setAccessible(true);
                    method.invoke(noBugDto, null);
                } catch (Exception e) {

                    errorNumber++;
                    log.append(method.getName());
                    log.append(" ");
                    log.append("has error:");
                    log.append("\n\r  caused by ");
                    e.printStackTrace();
                }
            }
        }
        log.append(clazz.getSimpleName());
        log.append(" has  ");
        log.append(errorNumber);
        log.append(" error.");

        // 生成测试报告
        System.out.println(log.toString());

        // Lambda表达式里面不能访问非final的局部变量
/*        Arrays.stream(methods).forEach(method -> {
            if (method.isAnnotationPresent(JianCha.class)) {

                // true表示反射对象应该在使用时抑制Java语言访问检查
                // false表示反射的对象应该强制执行Java语言访问检查
                method.setAccessible(true);
                try {

                    method.invoke(clazz, null);

                } catch (Exception e) {
                    System.out.println(errorNumber);

                    e.printStackTrace();

                }
            }
        });*/


    }


}
