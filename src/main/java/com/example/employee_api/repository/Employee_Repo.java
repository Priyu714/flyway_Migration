package com.example.employee_api.repository;

import com.example.employee_api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee_Repo extends JpaRepository<Employee,Integer> {
}