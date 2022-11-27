package com.company.employee.service;

import com.company.employee.dao.EmployeeDao;
import com.company.employee.entity.Employee;
import com.company.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployee(EmployeeDao dao) {
        Employee e = new Employee();
        e.setEmpId(dao.getEmpId());
        e.setName(dao.getName());
        e.setSalary(dao.getSalary());
        e.setContractor(dao.isContractor());
        employeeRepository.save(e);
        return e;
    }
    public Employee getEmployee(long empId){
        Employee e = new Employee();
        e = employeeRepository.findById(empId);

        return e;
    }
}
