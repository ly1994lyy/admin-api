package com.ly.adminapi.controller;

import com.ly.adminapi.entity.User;
import com.ly.adminapi.service.UserService;
import jakarta.validation.Valid;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("user")
    public List<User> getUser(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize){
        return userService.getUser(pageNum,pageSize);
    }

    @PostMapping("user")
    public String addUser(@Valid @RequestBody User user){
        userService.addUser(user);
        return "成功";
    }
}
