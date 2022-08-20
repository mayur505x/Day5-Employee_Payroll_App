package com.bridgelabz.employeepayrollapp.controller;


import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/employeepayrollservice")
public class EmployeePayrollAppController {

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<String> getEmployeePayrollData(){
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId")int empId){
        return new ResponseEntity<String>("Get Call Success for id:"+empId,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDto employeePayrollDTO){
        return new ResponseEntity<String>("Created Employee Payroll Data for:"+employeePayrollDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDto employeePayrollDTO){
        return new ResponseEntity<String>("Upated Employee Payroll Data for:"+employeePayrollDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId")int empId){
        return new ResponseEntity<String>("Delete Call Success for id:"+empId,HttpStatus.OK);
    }

}