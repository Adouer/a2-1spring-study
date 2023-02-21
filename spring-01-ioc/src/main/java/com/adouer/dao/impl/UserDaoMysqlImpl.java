package com.adouer.dao.impl;

import com.adouer.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("mysql获取用户");
    }
}
