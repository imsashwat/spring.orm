package com.lcwd.orm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lcwd.orm.entities.User;
import com.lcwd.orm.repositories.UserRepository;

public interface UserService {

    User saveUser(User user);

    User updateUser(User user, int userId);

    void deleteUser(int userId);

    List<User> getAllUser();

    User getUser(int userId);

}
