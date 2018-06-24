package com.xsx.mybbs.controllers;

import com.xsx.mybbs.entitys.User;
import com.xsx.mybbs.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ResponseBody
    @RequestMapping("/AllUserList")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
