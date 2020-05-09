package com.tt.spring.annotation.switchdatasource.config;

import lombok.Data;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc 数据库参数
 * @Author cmlx
 * @Date 2020-5-9 0009 16:58
 */
@Data
public class DataSourceProperties {

    /**
     * 连接名，用于切换数据库
     */
    private String name;

    /**
     * 库名
     */
    private String db;

    /**
     * 连接地址
     */
    private String baseUrl;

    /**
     * 连接地址
     */
    private String searchUrl;

    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private Integer maxActive;
    private Integer initialSize;
    private Integer minIdle;
    private Integer maxIdle;
    private Boolean testWhileIdle;
    private Boolean testOnBorrom;
    private Integer minEvictableIdleTimeMillis;
    private Integer timeBetweenEvictionRunsMillis;
    private Integer maxWait;
    private Integer removeAbandonedTimeout;
    private Boolean removeAbandoned;
    private Integer validationInterval;
    private String validationQuery;
    private Boolean defaultAutoCommit;
    private Boolean defaultReadOnly;

    public String makeUrl() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getBaseUrl());

        if (StringUtils.hasText(this.getDb())) {
            builder.append("/").append(this.getDb());
        }
        if (StringUtils.hasText(this.getSearchUrl())) {
            builder.append("?").append(this.getSearchUrl());
        }

        return builder.toString();

    }

    public String getUrl() {
        if (null == url) {
            url = makeUrl();
        }
        return url;
    }

    public List<String> ignore() {
        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("db");
        list.add("baseUrl");
        list.add("searchUrl");
        list.add("class");
        return list;
    }


}
