package com.tt.spring.annotation.switchdatasource.multiData;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Desc 多数据源路由
 * @Author cmlx
 * @Date 2020-5-9 0009 16:10
 */
public class DynamicDataSourceRouter extends AbstractRoutingDataSource {

    private static final ThreadLocal<String> dataSource = new ThreadLocal<>();

    @Override
    protected Object determineCurrentLookupKey() {
        return getDataSource();
    }

    public String getDataSource() {
        return dataSource.get();
    }

    public void clearDataSource() {
        dataSource.remove();
    }

    public void setDataSource(String customerType) {
        dataSource.set(customerType);
    }

}
