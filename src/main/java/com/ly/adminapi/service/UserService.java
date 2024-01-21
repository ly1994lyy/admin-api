package com.ly.adminapi.service;

import com.ly.adminapi.entity.User;
import com.ly.adminapi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUser(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users =userMapper.getUser();
        PageInfo<User> pageInfo =new PageInfo<>(users);
        return pageInfo.getList();
    }

    public String addUser(User user){
        userMapper.addUser(user);
        return "成功";
    }
}
