package com.admin.service;

import com.admin.entity.Department;
import com.admin.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentSevice {
    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getAllDepartment(){
        return  departmentMapper.selectList(null);
    }

    public int AddDepartment(Department department){
        return departmentMapper.insert(department);
    }
}
