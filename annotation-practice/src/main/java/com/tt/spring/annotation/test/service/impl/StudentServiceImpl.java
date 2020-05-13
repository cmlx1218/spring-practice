package com.tt.spring.annotation.test.service.impl;

import com.tt.spring.annotation.test.persist.mapper.StudentMapper;
import com.tt.spring.annotation.test.pojo.dto.StudentDto;
import com.tt.spring.annotation.test.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-5-12 0012 18:21
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public StudentDto getStudent(Long id) {
        StudentDto studentDto = studentMapper.getStudentById(id);
        return studentDto;
    }
}
