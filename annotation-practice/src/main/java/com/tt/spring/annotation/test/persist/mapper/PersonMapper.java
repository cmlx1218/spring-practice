package com.tt.spring.annotation.test.persist.mapper;

import com.tt.spring.annotation.test.pojo.dto.PersonDto;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-5-12 0012 18:37
 */
public interface PersonMapper {

    PersonDto getPersonById(Integer id);

}
