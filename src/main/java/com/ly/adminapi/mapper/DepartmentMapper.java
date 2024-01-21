package com.ly.adminapi.mapper;

import com.ly.adminapi.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    @Select("select * from t_department")
    List<Department> getAll();
}
