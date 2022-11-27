package com.company.employee.entity;

import lombok.Data;

import javax.persistence.*;

//to create table for the class in DB
@Entity
//it will be the table name
@Table(name = "EmployeeData")
//getter,setter no need to be generated as lombok will take care of it
@Data

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long empId;
    String name;
    double salary;
    boolean isContractor;

}
