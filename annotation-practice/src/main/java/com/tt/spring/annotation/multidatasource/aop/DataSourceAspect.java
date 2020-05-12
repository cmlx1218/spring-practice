package com.tt.spring.annotation.multidatasource.aop;

import com.tt.spring.annotation.multidatasource.annotation.CurDataSource;
import com.tt.spring.annotation.multidatasource.config.DataSourceNames;
import com.tt.spring.annotation.multidatasource.config.DynamicDataSource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @Desc 多数据源，切面处理类
 * @Author cmlx
 * @Date 2020-5-12 0012 17:53
 */
@Slf4j
@Aspect
@Component
public class DataSourceAspect implements Ordered {

    @Around(value = "@annotation(curDataSource)")
    public Object around(ProceedingJoinPoint point, CurDataSource curDataSource) throws Throwable {
        if (curDataSource == null){
            DynamicDataSource.setDataSource(DataSourceNames.FIRST);
            log.info("set dataSource is" + DataSourceNames.FIRST);
        }else {
            DynamicDataSource.setDataSource(DataSourceNames.SECOND);
            log.info("set dataSource is" + DataSourceNames.SECOND);
        }

        try {
            return point.proceed();
        } finally {
            DynamicDataSource.clearDataSource();
            log.info("clean dataSource");
        }

    }


    @Override
    public int getOrder() {
        return 1;
    }
}
