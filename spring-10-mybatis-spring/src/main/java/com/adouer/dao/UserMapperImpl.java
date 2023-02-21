package com.adouer.dao;

import com.adouer.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapperr{

    SqlSessionTemplate sessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    @Override
    public List<User> queryAll() {
        UserMapperr mapper = sessionTemplate.getMapper(UserMapperr.class);
        return mapper.queryAll();
    }
}
