package com.tt.spring.annotation.switchdatasource.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-5-9 0009 17:36
 */
@Data
@ConfigurationProperties(prefix = "annotation.jdbc")
public class JdbcProperties {

    private boolean enableLazyProxy = false;
    private boolean enableDynamicSwitching = false;

    private DataSourceProperties defaultDataSource = new DataSourceProperties();
    private List<DataSourceProperties> dataSource = new ArrayList<>();

}
