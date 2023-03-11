package com.admin.mapper;

import com.admin.entity.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {
//    @Select("select * from t_department")
//    public List<Department> find();
//
//    @Insert("insert into t_department values (#{id},#{departmentName},#{pid},#{parentName},#{isDelete})")
//    public int insert(Department department);
}