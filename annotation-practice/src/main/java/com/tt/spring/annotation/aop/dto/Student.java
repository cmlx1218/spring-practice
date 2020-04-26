package com.tt.spring.annotation.aop.dto;

import com.tt.spring.annotation.aop.annotation.CoverTime;
import lombok.Data;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-4-26 0026 15:01
 */
@Data
public class Student {

    private Integer id;

    private String userName;

    private Long startTime;

    private String endTime;


    public Student(Integer id, String userName, Long startTime, String endTime) {
        this.id = id;
        this.userName = userName;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
