package com.example.carrental;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class EmployeeRepo {

    private static  EmployeeRepo instance = null;
    private List<Employee> employees = new ArrayList<>();

    private EmployeeRepo() //constructor
    {
        Employee emp = new Employee();
        emp .firstname = "krishna";
        emp .lastname= "naik";
        emp .username = "knaik@gmail.com";
        emp .Password = "kkk";
        this.employees.add(emp);
    }


    public static EmployeeRepo getInstance() //Method
    {
        if (instance == null) {
            instance = new EmployeeRepo();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return this.employees ;
    }




}
