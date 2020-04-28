package com.tt.spring.annotation.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-4-26 0026 15:06
 */
@Aspect
@Component
public class CoverTimeAop {

    @Pointcut("@annotation(com.tt.spring.annotation.aop.annotation.CoverTime)")
    public void coverTimePointCut() {

    }


    //    @Before("coverTimePointCut()")
    @Before(value = "@annotation(coverTime)")
    public void coverTime(JoinPoint joinPoint, CoverTime coverTime) throws Throwable {

        int isNeedCover = coverTime.isNeedCover();
        int type = coverTime.type();
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        Object target = joinPoint.getTarget();


        if (isNeedCover == 1) {
            // 转为时间戳
            if (type == 0) {
                args[2] = coverToString(args[2]);
            }
            // 转为yyyy-MM-dd HH:mm:ss
            if (type == 1) {
                args[3] = coverToTimeStamp(args[3]);
            }
        }
        MethodInvocationProceedingJoinPoint me = (MethodInvocationProceedingJoinPoint) joinPoint;
        me.proceed(args);


    }

    private String coverToString(Object arg) {
        String s = null;
        if (arg instanceof Long) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            s = sdf.format(new Date(Long.valueOf((String) arg)));
        }
        return s;


    }

    private Long coverToTimeStamp(Object arg) throws ParseException {
        Long l = null;
        if (arg instanceof String) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            l = Long.valueOf(String.valueOf(sdf.parse((String) arg)));
        }
        return l;
    }


}
