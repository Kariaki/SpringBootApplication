package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDataRepository implements UserDao{
    private static List<User>DB=new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        User newUser=new User(user.getUsername(),id,user.getPassword());
        DB.add(newUser);
        return 200;
    }
}
