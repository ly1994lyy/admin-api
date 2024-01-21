package com.ly.adminapi.mapper;

import com.ly.adminapi.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from t_user")
    List<User> getUser();

    @Insert("insert into t_user (id,username,password) values (#{id},#{username},#{password})")
    void addUser(User user);
}
