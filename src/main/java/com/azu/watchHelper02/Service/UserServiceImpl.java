package com.azu.watchHelper02.Service;


import com.azu.watchHelper02.entity.User;
import com.azu.watchHelper02.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int registerUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User login(String username) {
        return userMapper.selectByUsername(username);
    }
}