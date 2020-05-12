package com.tt.spring.annotation.test.service;

import com.tt.spring.annotation.test.pojo.dto.PersonDto;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-5-12 0012 18:21
 */
public interface IPersonService {


    PersonDto getPerson(Integer id);
}
