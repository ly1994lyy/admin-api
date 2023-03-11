package com.admin.controller;
import com.admin.entity.Department;
import com.admin.service.DepartmentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentSevice departmentSevice;

    @GetMapping("/department")
    public List<Department> getDepartment(){
        return departmentSevice.getAllDepartment();
    }

    @PostMapping("/department")
    public int AddDepartment(@Valid @NonNull @RequestBody Department department){
        return departmentSevice.AddDepartment(department);
    }

}
