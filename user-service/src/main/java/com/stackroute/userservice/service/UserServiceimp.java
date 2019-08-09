package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exception.UserAlredyExistsException;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimp implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceimp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) throws UserAlredyExistsException {
        if (userRepository.existsById(user.getId())) {
            throw new UserAlredyExistsException("user already exists");
        }
        User saveduser = userRepository.save(user);
        if (saveduser == null) {
            throw new UserAlredyExistsException("user already exists");
        }
        return saveduser;
    }

    @Override
    public User getUserById(int id) {
        User userid = userRepository.findById(id).get();
        return userid;
    }
}
