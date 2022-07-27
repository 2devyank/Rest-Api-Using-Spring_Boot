package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repositary.DepartmentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public void deleteDepartment(Long departmentId) {
         departmentRepositary.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId,Department department) {
        Department dep=departmentRepositary.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName())&&
                !"".equalsIgnoreCase(department.getDepartmentName())){
            dep.setDepartmentName(department.getDepartmentName());

        }
        if(Objects.nonNull(department.getDepartmentAddress())&&
                !"".equalsIgnoreCase(department.getDepartmentAddress())){
            dep.setDepartmentAddress(department.getDepartmentAddress());

        }
        if(Objects.nonNull(department.getDepartmentCode())&&
                !"".equalsIgnoreCase(department.getDepartmentCode())){
            dep.setDepartmentCode(department.getDepartmentCode());

        }
        return departmentRepositary.save(dep);
    }
}
