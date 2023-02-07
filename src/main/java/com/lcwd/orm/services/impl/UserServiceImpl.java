package com.lcwd.orm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.orm.entities.User;
import com.lcwd.orm.repositories.UserRepository;
import com.lcwd.orm.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {

        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User updateUser(User user, int userId) {

        return null;
    }

    @Override
    public void deleteUser(int userId) {

    }

    @Override
    public List<User> getAllUser() {

        return null;
    }

    @Override
    public User getUser(int userId) {

        return null;
    }

}
