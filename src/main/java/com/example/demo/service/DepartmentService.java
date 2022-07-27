package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
 public Department saveDepartment(Department department) ;


 public List<Department> getDepartment();

public Department getDepartmentbyid(Long depertmentId);

 public void deleteDepartment(Long departmentId);

 public Department updateDepartment(Long departmentId,Department department);
}
