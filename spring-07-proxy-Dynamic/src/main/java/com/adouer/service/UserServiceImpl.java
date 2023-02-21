package com.adouer.service;

import com.adouer.dao.UserDao;
import com.adouer.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    UserDao userDao = new UserDaoImpl();
    @Override
    public void add() {
        userDao.add();
    }

    @Override
    public void delete() {
        userDao.delete();
    }

    @Override
    public void update() {
        userDao.update();
    }

    @Override
    public void select() {
        userDao.select();
    }
}
