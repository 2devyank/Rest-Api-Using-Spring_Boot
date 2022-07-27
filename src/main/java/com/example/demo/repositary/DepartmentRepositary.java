package com.example.demo.repositary;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositary extends JpaRepository<Department,Long> {
}
