package com.tt.spring.annotation.aop.controller;

import com.tt.spring.annotation.aop.annotation.CoverTime;
import com.tt.spring.annotation.aop.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-4-26 0026 15:36
 */
@Controller
@RequestMapping("/annotation")
public class CoverTimeController {

    @RequestMapping("/coverTime")
    @CoverTime(isNeedCover = 1, type = 1)
    public ModelAndView addStudent(Integer id, String userName, Long startTime, String endTime) {
        Student student = new Student(id, userName, startTime, endTime);
        System.out.println(student);
        return null;
    }

}
