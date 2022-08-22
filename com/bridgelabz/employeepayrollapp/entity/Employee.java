package com.bridgelabz.employeepayrollapp.entity;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDto;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class Employee {
    private  int employeeId;
    private String name;
    private long salary;


    public Employee(int empId, EmployeePayrollDto empPayrollDTO) {
        this.employeeId = empId;
        this.name = empPayrollDTO.name;
        this.salary = empPayrollDTO.salary;
    }
}
