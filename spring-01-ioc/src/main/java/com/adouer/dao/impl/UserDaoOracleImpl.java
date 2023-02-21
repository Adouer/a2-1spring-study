package com.adouer.dao.impl;

import com.adouer.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("oracle获取用户");
    }
}
