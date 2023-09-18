package com.example.employee_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    private Integer employee_id;
    private String name;
    private String post;
    private Double salary;

}
