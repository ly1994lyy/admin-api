package com.ly.adminapi.controller;

import com.ly.adminapi.entity.Department;
import com.ly.adminapi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("department")
    public List<Department> getAll(){
        return departmentService.getAll();
    }

}
