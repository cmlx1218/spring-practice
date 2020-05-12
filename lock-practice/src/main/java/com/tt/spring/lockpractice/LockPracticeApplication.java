package com.tt.spring.lockpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author CMLX
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class LockPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LockPracticeApplication.class, args);
    }

}
