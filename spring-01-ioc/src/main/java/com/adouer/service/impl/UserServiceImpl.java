package com.adouer.service.impl;

import com.adouer.dao.UserDao;
import com.adouer.service.UserService;

public class UserServiceImpl implements UserService {
    /*
    //方式一：传统方式获取userDaoImpl,程序改变
    UserDao userDao = new UserDaoImpl();
    UserDao userDao = new UserDaoMysqlImpl();
    */

    /*
     *方式二：构造方法注入

    private UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
     */

    /**
     * 方式三：set方法注入
     * @param userDao
     */
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
