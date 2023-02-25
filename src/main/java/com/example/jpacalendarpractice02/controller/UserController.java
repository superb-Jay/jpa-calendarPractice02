package com.example.jpacalendarpractice02.controller;

import com.example.jpacalendarpractice02.dto.UserRequest;
import com.example.jpacalendarpractice02.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    private final UserService userService;

//cicd test
    @PostMapping("/users")
    public String insertUser(UserRequest userRequest) {
        return userService.insertUser(userRequest);
    }

    @PostMapping("/login")
    public String selectUser(UserRequest userRequest, HttpSession session) {
        String user = userService.selectUser(userRequest);

        if(user.equals("success")) {
            session.setAttribute("email",userRequest.getEmail());
        }

        return user;

    }





}
