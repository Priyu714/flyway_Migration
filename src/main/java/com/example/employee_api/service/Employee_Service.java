package com.example.employee_api.service;

import com.example.employee_api.entity.Employee;
import com.example.employee_api.repository.Employee_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class Employee_Service {

    @Autowired
    Employee_Repo employeeRepo;

    public Employee createNewEmployee (Employee employee){
        return employeeRepo.save(employee);
    }

    public List<Employee> getListOfEmployee(){
        return employeeRepo.findAll();
    }

    public Employee getById(Integer id){
        return employeeRepo.findById(id).get();
    }

    public String deleteById(Integer id){
         employeeRepo.deleteById(id);
         return "Id deleted Successfully";
    }

    public Employee updateById(Integer id, Employee employee){

        if(!employeeRepo.existsById(id))
            System.out.println("Id is not found");


        return employeeRepo.save(employee);
    }

}
