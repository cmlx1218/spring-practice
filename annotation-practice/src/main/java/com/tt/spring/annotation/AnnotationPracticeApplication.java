package com.tt.spring.annotation;

import com.tt.spring.annotation.multidatasource.config.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * @author CMLX
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.tt.spring.annotation.test.persist.mapper")
@Import({DynamicDataSourceConfig.class})
public class AnnotationPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnotationPracticeApplication.class, args);
    }

}
