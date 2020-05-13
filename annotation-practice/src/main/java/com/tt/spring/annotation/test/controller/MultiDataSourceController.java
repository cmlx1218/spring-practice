package com.tt.spring.annotation.test.controller;

import com.tt.spring.annotation.test.pojo.dto.PersonDto;
import com.tt.spring.annotation.test.pojo.dto.StudentDto;
import com.tt.spring.annotation.test.service.IPersonService;
import com.tt.spring.annotation.test.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.NotNull;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-5-12 0012 18:20
 */
@Controller
@RequestMapping("/datasource")
public class MultiDataSourceController {

    @Autowired
    IStudentService iStudentService;

    @Autowired
    IPersonService iPersonService;

    @RequestMapping("/getStudent")
    public StudentDto getStudent(@NotNull Long id) {
        return iStudentService.getStudent(id);
    }

    @RequestMapping("/getPerson")
    public PersonDto getPerson(@NotNull Integer id) {
        return iPersonService.getPerson(id);
    }

}
