package com.ly.adminapi.service;

import com.ly.adminapi.entity.Department;
import com.ly.adminapi.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getAll(){
        return departmentMapper.getAll();
    }
}
