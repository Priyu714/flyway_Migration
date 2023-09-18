package com.example.employee_api.controller;

import com.example.employee_api.entity.Employee;
import com.example.employee_api.service.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Employee_Data")
public class Employee_Controller {

    @Autowired
    Employee_Service employeeService;

    @PostMapping("/user")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.createNewEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping("/user")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<>(employeeService.getListOfEmployee(),HttpStatus.FOUND);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
        return new ResponseEntity<>(employeeService.getById(id),HttpStatus.FOUND);
    }
    @PutMapping("/user/{id}")
    public ResponseEntity<Employee> updateById(@PathVariable Integer id, @RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.updateById(id,employee),HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id){
        return new ResponseEntity<>(employeeService.deleteById(id),HttpStatus.OK);
    }
}
