package com.tt.spring.annotation.switchdatasource.aop;

import com.tt.spring.annotation.switchdatasource.annotation.DataSource;
import com.tt.spring.annotation.switchdatasource.multiData.DynamicDataSourceRouter;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-5-9 0009 16:07
 */
@Aspect
public class DynamicDataSourceAspect {

    @Autowired
    private DynamicDataSourceRouter dataSourceRouter;

    @Around("@annotation(dataSource)")
    public Object around(ProceedingJoinPoint pjp, DataSource dataSource) throws Throwable {
        dataSourceRouter.setDataSource(dataSource.key());
        try {
            return pjp.proceed();
        } finally {
            dataSourceRouter.clearDataSource();
        }
    }


}
