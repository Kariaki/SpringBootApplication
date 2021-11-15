package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class UserService {
  public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    private final UserDao userDao;

    public int insertUser(User user){
        return userDao.insertUser(user);
    }
}
