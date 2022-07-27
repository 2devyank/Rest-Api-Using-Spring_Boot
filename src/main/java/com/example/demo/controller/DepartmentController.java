package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> getDepartment(){
        return departmentService.getDepartment();
    }
    @GetMapping("/department/{id}")
    public Department getDepertmentbyid(@PathVariable("id") Long depertmentId){
    return departmentService.getDepartmentbyid(depertmentId);

    }

}
