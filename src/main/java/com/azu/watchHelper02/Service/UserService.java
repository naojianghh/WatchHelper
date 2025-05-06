package com.azu.watchHelper02.Service;

import com.azu.watchHelper02.entity.User;

public interface UserService {
    int registerUser(User user);
    User login(String username);
}
