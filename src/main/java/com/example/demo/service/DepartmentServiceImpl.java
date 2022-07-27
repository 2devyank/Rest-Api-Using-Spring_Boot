package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repositary.DepartmentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepositary departmentRepositary;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepositary.save(department);
    }

    @Override
    public List<Department> getDepartment() {
        return departmentRepositary.findAll();
    }

    @Override
    public Department getDepartmentbyid(Long depertmentId) {
        return departmentRepositary.findById(depertmentId).get();
    }
}
