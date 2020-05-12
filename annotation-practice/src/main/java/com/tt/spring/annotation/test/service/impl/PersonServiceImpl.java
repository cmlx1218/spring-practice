package com.tt.spring.annotation.test.service.impl;

import com.tt.spring.annotation.multidatasource.annotation.CurDataSource;
import com.tt.spring.annotation.multidatasource.config.DataSourceNames;
import com.tt.spring.annotation.test.persist.mapper.PersonMapper;
import com.tt.spring.annotation.test.pojo.dto.PersonDto;
import com.tt.spring.annotation.test.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Desc
 * @Author cmlx
 * @Date 2020-5-12 0012 18:22
 */
public class PersonServiceImpl implements IPersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    @CurDataSource(name = DataSourceNames.SECOND)
    public PersonDto getPerson(Integer id) {
        return personMapper.getPersonById(id);
    }
}
