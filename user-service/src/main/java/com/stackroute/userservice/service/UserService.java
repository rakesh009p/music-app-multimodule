package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exception.UserAlredyExistsException;

public interface UserService {
    public User saveUser(User user) throws UserAlredyExistsException;
       public User getUserById(int id);
}
