package com.stackroute.userservice.Controller;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exception.UserAlredyExistsException;
import com.stackroute.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class UserController {
    private UserService userService;

    public UserController() {
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("user")
    public ResponseEntity<?> setUser(@RequestBody User user) {
        ResponseEntity responseEntity;

        try {
            userService.saveUser(user);
            responseEntity = new ResponseEntity<String>("sucessfully ceated", HttpStatus.CREATED);

        } catch (UserAlredyExistsException e) {
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
            e.printStackTrace();

        }

        return responseEntity;

    }

    @GetMapping("user/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        User retrivedUser = userService.getUserById(id);
        return new ResponseEntity<>(retrivedUser, HttpStatus.OK);


    }
}
