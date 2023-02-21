package com.adouer.dao.impl;

import com.adouer.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("dao获取用户");
    }
}
