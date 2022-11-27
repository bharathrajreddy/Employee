package com.company.employee.controller;

import com.company.employee.dao.EmployeeDao;
import com.company.employee.entity.Employee;
import com.company.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employee/info")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/createEmployee")

    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDao dao){
        Employee e = employeeService.createEmployee(dao);
        return ResponseEntity.status(HttpStatus.CREATED).body(e);
    }

    @GetMapping("/getEmployee/empId/{empId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("empId") long empId){
        Employee e = employeeService.getEmployee(empId);
        return ResponseEntity.status(HttpStatus.OK).body(e);

    }

}
