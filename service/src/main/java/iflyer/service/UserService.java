/*
 * Copyright (c) 2017. Rio Hwang Products. All rights reserved.
 */

package iflyer.service;

import iflyer.dao.UserDao;
import iflyer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    //@Autowired
    UserDao userDao;

    public User getUser(String name) {
        return userDao.getUser(name);
    }


    public User saveUser(String name, int age) {
        User exists = userDao.getUser(name);
        if (exists == null) {
            return userDao.saveUser(name, age);
        }
        else {
            return exists;
        }
    }
}
